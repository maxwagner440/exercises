package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

	FruitTree sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new FruitTree("Apple", 10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPickingFewer() {
		//creates result to check to see if you can pick "9".
		boolean result = sut.pickFruit(9);
		//first looks if its true, second looks how many are left.
		assertEquals(true, result);
		assertEquals(1, sut.getPiecesOfFruitLeft());
	}
	@Test
	public void testPickingAll() {
		//creates result to check to see if you can pick "9".
		boolean result = sut.pickFruit(10);
		//first looks if its true, second looks how many are left.
		assertEquals(true, result);
		assertEquals(0, sut.getPiecesOfFruitLeft());
	}
	@Test
	public void testPickingMoreThan() {
		//creates result to check to see if you can pick "9".
		boolean result = sut.pickFruit(11);
		//first looks if its true, second looks how many are left.
		assertEquals(false, result);
		assertEquals(10, sut.getPiecesOfFruitLeft());
	}
	@Test
	public void testPickingDifferentParts() {
		//creates result to check to see if you can pick "9".
		boolean result = sut.pickFruit(5);
		//first looks if its true, second looks how many are left.
		assertEquals(true, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
		
		result = sut.pickFruit(5);
		//first looks if its true, second looks how many are left.
		assertEquals(true, result);
		assertEquals(0, sut.getPiecesOfFruitLeft());
		
	}
	@Test
	public void testPickingDifferentPartsMore() {
		//creates result to check to see if you can pick "9".
		boolean result = sut.pickFruit(5);
		//first looks if its true, second looks how many are left.
		assertEquals(true, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
		
		result = sut.pickFruit(6);
		//first looks if its true, second looks how many are left.
		assertEquals(false, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
		
	}
}
