package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	Employee sut;
	
	@Before
	public void setUp() throws Exception {
	sut = new Employee(1, "Max", "Wagner", 1000.00);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFullName() {
		String theFull	= sut.FullName();
		
		assertEquals("Wagner, Max", theFull);
	}


	@Test
	public void testRaise() {
		double raiseAmt	= sut.RaiseSalary(10.0);
		assertEquals(1100, raiseAmt, 0D);
		
	}

	@Test
	public void testRaiseNeg() {
		double raiseNeg	= sut.RaiseSalary(-10);
		assertEquals(900, raiseNeg, 0D);
		
	}
}
