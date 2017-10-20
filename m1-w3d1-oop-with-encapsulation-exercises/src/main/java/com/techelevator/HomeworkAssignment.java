package com.techelevator;

public class HomeworkAssignment {
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName = "";
	
	public HomeworkAssignment(int possibleMarks){
		this.possibleMarks = possibleMarks;
	}
	
	public String getLetterGrade(){
		if((double) totalMarks / (double) possibleMarks >= 0.90){
			return "A";
		}
		else if((double) totalMarks / (double) possibleMarks >= 0.80){
			return "B";
		}
		else if((double) totalMarks / (double) possibleMarks >= 0.70){
			return "C";
		}
		else if((double) totalMarks / (double) possibleMarks >= 0.60){
			return "D";
		}
		else {
			return "F";
		}
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submittersName) {
		this.submitterName = submittersName;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	
	
}
