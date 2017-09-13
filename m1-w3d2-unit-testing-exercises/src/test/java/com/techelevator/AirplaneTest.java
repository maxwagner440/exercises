package com.techelevator;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
	
	Airplane sut;
	@Before
	public void setUp() throws Exception {
		sut = new Airplane(10, 10);
	}


	@Test
	public void availFirstClassSeats() {
		
		int availSeats = sut.getAvailableFirstClassSeats();
		
		assertEquals(10, availSeats);
		
	}
	
	@Test
	public void availCoachSeats() {
		
		int availSeatsCoach = sut.getAvailableCoachSeats();
		
		assertEquals(10, availSeatsCoach);
		
	}
	
	@Test
	public void reserveSeatsFirstClass() {
		
		boolean availSeats = sut.Reserve(true, 10);
		
		assertEquals(true, availSeats);
		
	}
	
	@Test
	public void reserveSeatsCoach() {
		
		boolean availSeats = sut.Reserve(false, 10);
		
		assertEquals(true, availSeats);
		
	}
	@Test
	public void testCountAccurateAfterReserveFC() {
		
		sut.Reserve(true, 4);
		
		assertEquals(4, sut.getBookedFirstClassSeats());
		
	}
	@Test
	public void testCountAccurateAfterReserveFCLeftOver() {
		
		sut.Reserve(true, 4);
		
		assertEquals(6, sut.getAvailableFirstClassSeats());
		
	}
	
	@Test
	public void testCountAccurateAfterReserveCoach() {
		
		sut.Reserve(false, 8);
		
		assertEquals(8, sut.getBookedCoachSeats());
		
	}
	
	@Test
	public void testCountAccurateAfterReserveCoachLeftOver() {
		
		sut.Reserve(false, 8);
		
		assertEquals(2, sut.getAvailableCoachSeats());
		
	}
	
	@Test
	public void overbookFirstClass() {
		
		boolean availSeats = sut.Reserve(true, 20);
		
		assertEquals(false, availSeats);
		
	}
	
	
	@Test
	public void overbookCoach() {
		
		boolean availSeats = sut.Reserve(false, 20);
		
		assertEquals(false, availSeats);
		
	}
}
