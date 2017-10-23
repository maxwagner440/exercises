package com.techelevator.objects;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class CaloriesJDBCDAO implements CaloriesDAO {

	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CaloriesJDBCDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Calories> getAllEntries() {
		List<Calories> allEntries = new ArrayList<Calories>();
		String sqlSelectCals = "SELECT * FROM client_calories WHERE client_id=1";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectCals);
		while(results.next()){
			allEntries.add(mapRowToCalories(results));
		}
		return allEntries;
	}

	
	public Calories mapRowToCalories(SqlRowSet row) {
		Calories entry = new Calories();
		entry.setCaloriesConsumed(row.getBigDecimal("calories_consumed"));
		entry.setCaloriesNeeded(row.getBigDecimal("calories_needed"));
		entry.setDate(row.getDate("todays_date"));
		return entry;
	}
}
