package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	
	KataRomanNumerals sut;
	
	@Before
	public void setUp(){
	sut = new KataRomanNumerals();
	}
	
	@Test
	public void testRomanNumeralValue25(){
		assertEquals("XXV", sut.numtoRomanNum(25));
	}
	
	@Test
	public void testRomanNumeralValue50(){
		assertEquals("L", sut.numtoRomanNum(50));
	}
	
	@Test
	public void testRomanNumeralValue5(){
		assertEquals("XXV", sut.numtoRomanNum(5));
	}
}
