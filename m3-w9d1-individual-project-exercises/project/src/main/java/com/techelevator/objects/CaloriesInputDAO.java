package com.techelevator.objects;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public  interface CaloriesInputDAO {
	
	public List<CaloriesInput> getAllEntries();
	public CaloriesInput mapRowToCalories(SqlRowSet row);
	public List<CaloriesInput> getAllEntriesByUsername(String username) ;
	void saveNewEntry(CaloriesInput input, Long userId);
}
