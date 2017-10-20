package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {

	Elevator sut;
	
	@Before
	public void setUp() throws Exception {
	sut = new Elevator(1, 10);
	}

	@Test
	public void testConstructor() {
		assertEquals(10, sut.getNumberOfLevels());
		assertEquals(1, sut.getShaftNumber());
	}
	@Test
	public void testDoesDoorOpen() {
		sut.CloseDoor();
		sut.OpenDoor();
		assertEquals(true, sut.isDoorOpen());
	}
	
	@Test
	public void testDoesDoorClose() {
		sut.CloseDoor();
		assertEquals(false, sut.isDoorOpen());
	}
	
	@Test
	public void testGoesUp() {
		sut.CloseDoor();
		sut.goUp(9);
		assertEquals(9, sut.getCurrentLevel());
	}
	
	@Test
	public void testGoesDown() {
		sut.CloseDoor();
		sut.goUp(3);
		sut.goDown(2);
		assertEquals(2, sut.getCurrentLevel());
	}

	@Test
	public void testGoesPastTop() {
		sut.CloseDoor();
		sut.goUp(11);
		assertEquals(1, sut.getCurrentLevel());
	}
	
	@Test
	public void testMovesUpWithDoorOpen() {
		sut.goUp(5);
		assertEquals(1, sut.getCurrentLevel());
	}
	
	@Test
	public void testMovesDownWithDoorOpen() {
		sut = new Elevator(3, 10);
		
		sut.goDown(1);
		
		assertEquals(1, sut.getCurrentLevel());
	}
}
