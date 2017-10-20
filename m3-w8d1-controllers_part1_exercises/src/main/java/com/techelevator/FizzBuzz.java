package com.techelevator;

public class FizzBuzz {

	private int db1;
	private int db2;
	private String altFizz;
	private String altBuzz;
	private int number1;
	private int number2;
	private int number3;
	private int number4;
	private int number5;

	public String getCorrectOrder(int number){
		if(number % (db1 * db2) == 0 ){
			return altFizz + "" + altBuzz;
		}
		else if((number % db2) == 0){
			return altBuzz;
		}
		else if((number % db1) == 0){
			return altFizz;
		}
		else{
			return number + "";
		}
		
	}
	public int getDb1() {
		return db1;
	}
	public void setDb1(int db1) {
		this.db1 = db1;
	}
	public int getDb2() {
		return db2;
	}
	public void setDb2(int db2) {
		this.db2 = db2;
	}
	public String getAltFizz() {
		return altFizz;
	}
	public void setAltFizz(String altFizz) {
		this.altFizz = altFizz;
	}
	public String getAltBuzz() {
		return altBuzz;
	}
	public void setAltBuzz(String altBuzz) {
		this.altBuzz = altBuzz;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getNumber3() {
		return number3;
	}
	public void setNumber3(int number3) {
		this.number3 = number3;
	}
	public int getNumber4() {
		return number4;
	}
	public void setNumber4(int number4) {
		this.number4 = number4;
	}
	public int getNumber5() {
		return number5;
	}
	public void setNumber5(int number5) {
		this.number5 = number5;
	}
	
	
}
