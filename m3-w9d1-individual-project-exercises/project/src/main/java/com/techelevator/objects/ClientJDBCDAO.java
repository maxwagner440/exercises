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
	public void eat(BigDecimal intakeCalories){
		String sqlSelectInfoNeeded = "SELECT * FROM client WHERE client_id = 1";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectInfoNeeded);
		BigDecimal dailyCals;
//		dailyCals.add(intakeCalories);
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
	public Client getClientByUsername(String username) {
		Client client = new Client();
		String sqlSelectClient = "SELECT * FROM client WHERE username = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectClient, username);
		while(results.next()){
			client.setAge(results.getBigDecimal("age"));
			client.setFemale(results.getBoolean("gender"));
			client.setHeight(results.getBigDecimal("height"));
			client.setWeightInLbs(results.getBigDecimal("weight"));
			client.setFirstName(results.getString("first_name"));
			client.setLastName(results.getString("last_name"));
			client.setUsername(results.getString("username"));
			client.setPassword(results.getString("user_password"));
		}
		return null;
	}
	
	//
//	@Override
//	public List<Integer> getAllConsumedEntries() {
//		List<Integer> allEntries = new ArrayList<Integer>();
//		String sqlSelectCals = "SELECT * FROM client_calories WHERE client_id = 1";
//		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectCals);
//		while(results.next()){
//			allEntries.add(results.getInt("calories_consumed"));
//		}
//		return allEntries;
//	}
//	
//	@Override
//	public List<Integer> getAllNeededEntries(){
//		List<Integer> allEntries = new ArrayList<Integer>();
//		String sqlSelectCals = "SELECT * FROM client_calories WHERE client_id = 1";
//		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectCals);
//		while(results.next()){
//			allEntries.add(results.getInt("calories_needed"));
//		}
//		return allEntries;
//	}
	
//	@Override
//	public BigDecimal calculateCaloricNeeds(){
//		String sqlSelectInfoNeeded = "SELECT * FROM client WHERE client_id = 1";
//		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectInfoNeeded);
//		Client theClient = new Client();
//		while(results.next()){
//			theClient.setAge(results.getBigDecimal("age"));
//			theClient.setWeightInLbs(results.getBigDecimal("weight"));
//			theClient.setFemale(results.getBoolean("gender"));
//			theClient.setHeight(results.getBigDecimal("height"));
//		}
//			BigDecimal BMR = new BigDecimal(0);
//			BigDecimal weightInKg = theClient.getWeightInLbs().divide(new BigDecimal("2.2"));
//			BigDecimal height = theClient.getHeight().multiply(new BigDecimal("2.54"));
//			if(theClient.isFemale()){
//				BigDecimal part1 = new BigDecimal("665.09");
//				BigDecimal part2 = new BigDecimal("9.56").multiply(weightInKg);
//				BigDecimal part3 = new BigDecimal("1.84").multiply(height);
//				BigDecimal part4 = new BigDecimal("4.67").multiply(theClient.getAge());
//				BMR = BMR.add(part1).add(part2).add(part3).add(part4);
//		
//			}
//			else{
//				BigDecimal part1 = new BigDecimal("66.47");
//				BigDecimal part2 = new BigDecimal("13.75").multiply(weightInKg);
//				BigDecimal part3 = new BigDecimal("5.0").multiply(height);
//				BigDecimal part4 = new BigDecimal("6.75").multiply(theClient.getAge());
//				BMR = BMR.add(part1).add(part2).add(part3).add(part4);
//			}
//		theClient.setBMR(BMR);
//		return BMR;
//		
//	}


}
