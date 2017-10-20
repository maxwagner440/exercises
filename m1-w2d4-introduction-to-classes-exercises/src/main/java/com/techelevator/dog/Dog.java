package com.techelevator.dog;

public class Dog {

	private boolean sleeping = false;

	public String makeSound(){
		if(sleeping == false){
			return "Woof!";
		}else{
			return "Zzzzz...";
		}
		
	}
	
	public void sleep(){
		this.sleeping = true;
	}
	
	public void wakeUp(){
		this.sleeping = false;
	}
	
	
	
	public boolean isSleeping() {
		return sleeping;
	}

	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}
	
}
