package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	KataFizzBuzz sut;
	
	@Before
	public void setUp(){
		sut = new KataFizzBuzz();
	}
	
	@Test
	public void testMultiplesOfThree(){
		assertEquals("Fizz", sut.fizzBuzz(6));
	}
	
	@Test
	public void testMultiplesOfFive(){
		assertEquals("Buzz", sut.fizzBuzz(10));
	}
	
	@Test
	public void testMultiplesOfFifteen(){
		assertEquals("FizzBuzz", sut.fizzBuzz(30));
	}
	
	@Test
	public void testRandomNumber(){
		assertEquals("Fizz", sut.fizzBuzz(43));
	}
	
	@Test
	public void testRandomNumber2(){
		assertEquals("47", sut.fizzBuzz(47));
	}
	@Test
	public void testAbove100(){
		assertEquals("", sut.fizzBuzz(103));
	}
	
	@Test
	public void testBelow0(){
		assertEquals("", sut.fizzBuzz(-2));
	}
	
	@Test
	public void testHasA3(){
		assertEquals("Fizz", sut.fizzBuzz(73));
	}
	
	@Test
	public void testHasA5(){
		assertEquals("Buzz", sut.fizzBuzz(51));
	}
	
	@Test
	public void testHasA53(){
		assertEquals("FizzBuzz", sut.fizzBuzz(53));
	}
	
	@Test
	public void testHasA35(){
		assertEquals("FizzBuzz", sut.fizzBuzz(35));
	}
	
	@Test
	public void testHasA57(){
		assertEquals("Buzz", sut.fizzBuzz(57));
	}
}
