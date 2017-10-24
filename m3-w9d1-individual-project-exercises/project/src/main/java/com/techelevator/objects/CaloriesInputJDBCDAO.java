package com.techelevator.objects;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class CaloriesInputJDBCDAO implements CaloriesInputDAO {

	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CaloriesInputJDBCDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<CaloriesInput> getAllEntries() {
		List<CaloriesInput> allEntries = new ArrayList<CaloriesInput>();
		String sqlSelectCals = "SELECT * FROM client_calories WHERE client_id=1";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectCals);
		while(results.next()){
			allEntries.add(mapRowToCalories(results));
		}
		return allEntries;
	}

	
	public CaloriesInput mapRowToCalories(SqlRowSet row) {
		CaloriesInput entry = new CaloriesInput();
		entry.setCaloriesConsumed(row.getBigDecimal("calories_consumed"));
		entry.setCaloriesNeeded(row.getBigDecimal("calories_needed"));
		entry.setDate(row.getDate("todays_date"));
		return entry;
	}

	@Override
	public List<CaloriesInput> getAllEntriesByUsername(String username) {
		List<CaloriesInput> allClientEntries = new ArrayList<CaloriesInput>();
		String sqlSelectCals = "SELECT * FROM client_calories WHERE client_id = (SELECT client_id FROM client WHERE username = ?)";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectCals, username);
		while(results.next()){
			allClientEntries.add(mapRowToCalories(results));
		}
		return allClientEntries;
		
	}
}
