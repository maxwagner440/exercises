package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {
	//created instance variable that allows for different hw assignments again
	HomeworkAssignment sut;
	
	@Before
	public void setUp() throws Exception {
		//this is what is put thru before each "Test" method.
		//Arrange for EVERY TEST.
		sut = new HomeworkAssignment(100);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLetterGradeAhigh() {
		//Arrange
		sut.setTotalMarks(100);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert.    expect, actually got
		assertEquals("A", grade);
		
		
	}

	@Test
	public void testLetterGradeALow() {
		//Arrange
		//OR YOU COULD DO IT THIS WAY INSTEAD OF PUTTING sut IN "Before" method.
		HomeworkAssignment sut = new HomeworkAssignment(100);
		sut.setTotalMarks(90);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert.    expect, actually got
		assertEquals("A", grade);
	}
		
	
	@Test
	public void testLetterGradeBHigh() {
		//Arrange
		sut.setTotalMarks(89);
			
		//Act
		String grade = sut.getLetterGrade();
			
		//Assert.    expect, actually got
		assertEquals("B", grade);	
	
		
	}
	
	@Test
	public void testLetterGradeBLow() {
		//Arrange
		sut.setTotalMarks(80);
			
		//Act
		String grade = sut.getLetterGrade();
			
		//Assert.    expect, actually got
		assertEquals("B", grade);	
	}
	
	@Test
	public void testLetterGradeCHigh() {
		//Arrange
		sut.setTotalMarks(79);
			
		//Act
		String grade = sut.getLetterGrade();
			
		//Assert.    expect, actually got
		assertEquals("C", grade);	
	}
	
	@Test
	public void testLetterGradeCLow() {
		//Arrange
		sut.setTotalMarks(70);
			
		//Act
		String grade = sut.getLetterGrade();
			
		//Assert.    expect, actually got
		assertEquals("C", grade);	
	}
	
	@Test
	public void testLetterGradeDHigh() {
		//Arrange
		sut.setTotalMarks(69);
			
		//Act
		String grade = sut.getLetterGrade();
			
		//Assert.    expect, actually got
		assertEquals("D", grade);	
	}
	
	@Test
	public void testLetterGradeDLow() {
		//Arrange
		sut.setTotalMarks(60);
			
		//Act
		String grade = sut.getLetterGrade();
			
		//Assert.    expect, actually got
		assertEquals("D", grade);	
	}
	
	@Test
	public void testLetterGradeF() {
		//Arrange
		sut.setTotalMarks(59);
			
		//Act
		String grade = sut.getLetterGrade();
			
		//Assert.    expect, actually got
		assertEquals("F", grade);	
	}
	
	@Test
	public void testLetterGradeFLow() {
		//Arrange
		sut.setTotalMarks(20);
			
		//Act
		String grade = sut.getLetterGrade();
			
		//Assert.    expect, actually got
		assertEquals("F", grade);	
	}
	
	@Test
	public void testLetterGradeFNeg() {
		//Arrange
		sut.setTotalMarks(-21);
			
		//Act
		String grade = sut.getLetterGrade();
			
		//Assert.    expect, actually got
		assertEquals("F", grade);	
	}
	
	@Test
	public void testLetterGradeAMore() {
		//Arrange
		sut.setTotalMarks(120);
			
		//Act
		String grade = sut.getLetterGrade();
			
		//Assert.    expect, actually got
		assertEquals("A", grade);	
	}
}
