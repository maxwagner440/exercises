package com.techelevator;

public class SquirrelParty {

	private int numOfSquirrels;
	private boolean isWeekend;
	private boolean success;
	
	public SquirrelParty(int numOfSquirrels, boolean isWeekend){
		this.numOfSquirrels = numOfSquirrels;
		this.isWeekend = isWeekend;
	}
	
	public SquirrelParty(){
		
	}
	public boolean judgeParty(){
		if(numOfSquirrels >= 40 && numOfSquirrels <= 60 && isWeekend == false){
			return success;
		}
		if(numOfSquirrels >= 40 && isWeekend == true){
			return success;
		}
		else{
			return success == false;
		}
	}
	
	public int getNumOfSquirrels() {
		return numOfSquirrels;
	}
	public void setNumOfSquirrels(int numOfSquirrels) {
		this.numOfSquirrels = numOfSquirrels;
	}
	public boolean isWeekend() {
		return isWeekend;
	}
	public void setWeekend(boolean weekend) {
		this.isWeekend = weekend;
	}
	
	
}
