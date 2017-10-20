package com.techelevator;

public class NameColor {

	private String first;
	private String last;
	private String color;
	
	public NameColor(String first, String last, String color){
		this.first = first;
		this.last = last;
		this.color = color;
	}
	
	public NameColor(String first, String last){
		this.first = first;
		this.last = last;
	}
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
