package com.techelevator.objects;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class ClientJDBCDAO implements ClientDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ClientJDBCDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Client> getAllClients() {
		List<Client> allEntries = new ArrayList<Client>();
		String sqlSelectCals = "SELECT * FROM client";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectCals);
		while(results.next()){
			allEntries.add(mapRowToClient(results));
		}
		return allEntries;
	}

	
	public Client mapRowToClient(SqlRowSet row) {
		Client entry = new Client();
		entry.setAge((row.getBigDecimal("age")));
		entry.setHeight(row.getBigDecimal("height"));
		entry.setGoalWeightInLbs(row.getBigDecimal("weight"));
		entry.setFemale(row.getBoolean("gender"));
		entry.setUsername(row.getString("username"));
		
		return entry;
	}
	
	
	



	@Override
	public void doCardio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String finishDay() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getClientId(String username){
		Client client = new Client();
		String sqlSelectClient = "SELECT client_id FROM client WHERE username = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectClient, username);
		client.setClientId(results.getLong("client_id"));
		
		return client.getClientId();
	}

	@Override
	public Client getClientByUsername(String username) {
		Client client = new Client();
		String sqlSelectClient = "SELECT * FROM client WHERE username = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectClient, username);
		while(results.next()){
			client.setAge(results.getBigDecimal("age"));
			client.setFemale(results.getBoolean("gender"));
			client.setHeight(results.getBigDecimal("height"));
			client.setWeightInLbs(results.getBigDecimal("weight_lbs"));
			client.setFirstName(results.getString("first_name"));
			client.setLastName(results.getString("last_name"));
			client.setUsername(results.getString("username"));
			client.setPassword(results.getString("user_password"));
			client.setClientId(results.getLong("client_id"));
		}
		return client;
	}
	

	
	@Override
	public BigDecimal calculateCaloricNeeds(Long clientId){
		String sqlSelectInfoNeeded = "SELECT * FROM client WHERE client_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectInfoNeeded, clientId);
		Client theClient = new Client();
		while(results.next()){
			theClient.setAge(results.getBigDecimal("age"));
			theClient.setWeightInLbs(results.getBigDecimal("weight_lbs"));
			theClient.setFemale(results.getBoolean("gender"));
			theClient.setHeight(results.getBigDecimal("height"));
		}
			BigDecimal BMR = new BigDecimal(0);
			BigDecimal weightInKg = (BigDecimal) theClient.getWeightInLbs().divide(new BigDecimal("2.20"), BigDecimal.ROUND_HALF_EVEN).setScale(2);
			BigDecimal height = (BigDecimal) theClient.getHeight().multiply(new BigDecimal("2.54")).setScale(2);
			if(theClient.getIsFemale()){
				BigDecimal part1 = new BigDecimal("665.09");
				BigDecimal part2 = new BigDecimal("9.56").multiply(weightInKg);
				BigDecimal part3 = new BigDecimal("1.84").multiply(height);
				BigDecimal part4 = new BigDecimal("4.67").multiply(theClient.getAge());
				BMR = BMR.add(part1).add(part2).add(part3).add(part4);
		
			}
			else{
				BigDecimal part1 = new BigDecimal("66.47");
				BigDecimal part2 = new BigDecimal("13.75").multiply(weightInKg);
				BigDecimal part3 = new BigDecimal("5.00").multiply(height);
				BigDecimal part4 = new BigDecimal("6.75").multiply(theClient.getAge());
				BMR = BMR.add(part1).add(part2).add(part3).add(part4);
			}
		return BMR;
		
	}


}
