package com.pairprogramming.patterns.without;

import org.junit.Test;

public class HamburgerOrdererTest {

	@Test
	public void shouldCreateADeliciousSimpleSandwichWithBread() throws Exception {
		HamburgerOrderer sandwichOrderer = new HamburgerOrderer();
		
		sandwichOrderer.orderSimpleHamburger();
	}
	
	@Test
	public void shouldCreateADeliciousHamburgerWithCheese() throws Exception {
		HamburgerOrderer sandwichOrderer = new HamburgerOrderer();
		
		sandwichOrderer.orderHamburgerWithCheese();
	}
	
	@Test
	public void shouldCreateADeliciousHamburgerWithBacon() throws Exception {
		HamburgerOrderer sandwichOrderer = new HamburgerOrderer();
		
		sandwichOrderer.orderHamburgerWithBacon();
	}
	
	@Test
	public void shouldCreateADeliciousHamburgerWithBaconAndCheese() throws Exception {
		HamburgerOrderer sandwichOrderer = new HamburgerOrderer();
		
		sandwichOrderer.orderHamburgerWithBaconAndCheese();
	}
	
}
