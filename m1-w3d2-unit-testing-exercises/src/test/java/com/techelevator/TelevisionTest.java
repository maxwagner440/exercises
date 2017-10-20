package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

	Television sut;
	@Before
	public void setUp() throws Exception {
	sut = new Television();
	}


	@Test
	public void testTurnOff() {
		 sut.TurnOff();
		assertEquals(false, sut.IsOn());
	}

	@Test
	public void testTurnOn() {
		sut.TurnOn();
		assertEquals(true, sut.IsOn());
	}
	//volume boundries
	@Test
	public void testVolumeHighLimits() {
		sut.TurnOn();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		assertEquals(10, sut.getCurrentVolume());
	}
	@Test
	public void testVolumeLowLimits() {
		sut.TurnOn();
		sut.LowerVolume();
		sut.LowerVolume();
		sut.LowerVolume();
		assertEquals(0, sut.getCurrentVolume());
	}
	@Test
	public void testInitialVolume() {
		sut.TurnOn();
		assertEquals(2, sut.getCurrentVolume());
	}
	
	@Test
	public void testChangeChannel() {
		sut.TurnOn();
		sut.ChangeChannel(8);
		assertEquals(8, sut.getSelectedChannel());
	}

	@Test
	public void testChangeChannel2() {
		sut.TurnOn();
		sut.ChangeChannel(2);
		assertEquals(3, sut.getSelectedChannel());
	}
	
	@Test
	public void testChangeChannel19() {
		sut.TurnOn();
		sut.ChangeChannel(19);
		assertEquals(3, sut.getSelectedChannel());
	}
}
