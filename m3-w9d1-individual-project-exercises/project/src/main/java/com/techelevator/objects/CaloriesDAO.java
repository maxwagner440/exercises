package com.techelevator.objects;

import java.util.List;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public  interface CaloriesDAO {
	
	public List<Calories> getAllEntries();
	public Calories mapRowToCalories(SqlRowSet row);
}
