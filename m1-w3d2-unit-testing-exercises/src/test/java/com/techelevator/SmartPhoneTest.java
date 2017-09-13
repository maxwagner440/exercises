package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SmartPhoneTest {

	SmartPhone sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SmartPhone("4402200295", "Verizon");
	}

	@Test
	public void testReturnToFullCharge() {
		sut.Call("4402122323", 50);
		sut.RechargeBattery();
		assertEquals(100, sut.getBatteryCharge());
	}

	@Test
	public void testSpendTooMuchTimeOnCall() {
		sut.Call("4402122323", 120);
		
		assertEquals(0, sut.getBatteryCharge());
	}
	
	@Test
	public void testCanCallBeCompleted() {
		
		assertEquals(false, sut.Call("4402121324", 120));
	}
	
	@Test
	public void testCallingSevenDigits() {
		assertEquals(false, sut.Call("2122323", 10));
	}
	
	@Test
	public void testTooManyMethodsChangeObject() {
		sut.setOperatingSystem("AT&T");
		sut.setOperatingSystem("Boost Mobile");
		sut.setOperatingSystem("T-Mobile");
		assertEquals("T-Mobile", sut.getOperatingSystem() );
	}
	
}
