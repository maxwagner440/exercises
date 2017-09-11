package com.techelevator;

public class Television {

	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	
	
	public void turnOff(){
		isOn = false;
	}
	
	
	public void turnOn(){
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	
	public void changeChannel(int newChannel){
		if(isOn){
			if(newChannel <= 18 && newChannel >= 3){
				currentChannel = newChannel;
				}
				else{
					
				}	
		}
		
	}
	
	public void channelUp(){
		
		if(isOn){
			if( currentChannel < 18){
				currentChannel += 1;
			}else if( currentChannel == 18){
				currentChannel = 3;
			}else{
				
			}
		}
	}
	
	public void channelDown(){
		if(isOn){
			if( currentChannel > 3 ){
				currentChannel -= 1;
			}else if ( currentChannel == 3){
				currentChannel = 18;
			}else{
				
			}
		}
		
	}
	
	public void raiseVolume(){
		if(isOn){
			if(currentVolume < 10){
				currentVolume += 1;
			}
		}
	}
	
	public void lowerVolume(){
		if(isOn){
			if(currentVolume > 0){
				currentVolume -= 1;
			}
		}
	}
	
	
	public boolean isOn() {
			return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	
	
	
}
