package com.techelevator.critter.model;

import javax.sql.DataSource;

import org.bouncycastle.util.encoders.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.security.PasswordHasher;

@Component
public class JDBCUserDAO implements UserDAO {

	private JdbcTemplate jdbcTemplate;
	private PasswordHasher passwordHasher;

	@Autowired
	public JDBCUserDAO(DataSource dataSource, PasswordHasher passwordHasher) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.passwordHasher = passwordHasher;
	}
	
	@Override
	public void saveUser(String userName, String password) {
		byte [] salt = passwordHasher.generateRandomSalt();
		String hashedPassword = passwordHasher.computeHash(password, salt);
		String saltString = new String (Base64.encode(salt));
		String sqlStatement = "INSERT INTO app_user(user_name, password, salt) VALUES (?, ?, ?)";
		jdbcTemplate.update(sqlStatement, userName, hashedPassword, saltString);
	}

	@Override
	public boolean searchForUsernameAndPassword(String userName, String password) {
		String sqlSearchForUser = "SELECT * "+
							      "FROM app_user "+
							      "WHERE UPPER(user_name) = ? ";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchForUser, userName.toUpperCase());
		if(results.next()){
			String dbSalt = results.getString("salt");
			String dbHashedPassword = results.getString("password");
			String passwordCheck = passwordHasher.computeHash(password, Base64.decode(dbSalt));
			return passwordCheck.equals(dbHashedPassword);
		}
		return false;
	}

	@Override
	public void updatePassword(String userName, String password) {
		byte [] salt = passwordHasher.generateRandomSalt();
		String hashedPassword = passwordHasher.computeHash(password, salt);
		String saltString = new String (Base64.encode(salt));
		String sqlUpdatePassword = "UPDATE app_user SET password = ?, salt = ? WHERE user_name = ?";
		jdbcTemplate.update(sqlUpdatePassword, hashedPassword, saltString, userName);
		
	}

	@Override
	public User getUserFromUsername(String userName) {
		String sqlSearchForUser = "SELECT * FROM app_user WHERE user_name = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlSearchForUser, userName);
		User newUser = new User();
		newUser.setUserName(result.getString("userName"));
		newUser.setPassword(result.getString("password"));
		newUser.setConfirmPassword(result.getString("confirmPassword"));
		
		return newUser;
	}

}
