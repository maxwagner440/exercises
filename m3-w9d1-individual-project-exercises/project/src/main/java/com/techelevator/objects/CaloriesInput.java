package com.techelevator.objects;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class CaloriesInput {

	private BigDecimal caloriesConsumed;
	private BigDecimal caloriesNeeded;
	private Date date;
	
	
	public BigDecimal getCaloriesConsumed() {
		return caloriesConsumed;
	}
	public void setCaloriesConsumed(BigDecimal caloriesConsumed) {
		this.caloriesConsumed = caloriesConsumed;
	}
	public BigDecimal getCaloriesNeeded() {
		return caloriesNeeded;
	}
	public void setCaloriesNeeded(BigDecimal caloriesNeeded) {
		this.caloriesNeeded = caloriesNeeded;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
}
