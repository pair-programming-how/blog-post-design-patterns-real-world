package com.pairprogramming.patterns.without;

public class HamburgerOrderer {

	public void orderSimpleHamburger() {
		SimpleHamburger hamburger = new SimpleHamburger();
		
		hamburger.doIt();
	}

	public void orderHamburgerWithCheese() {
		HamburgerWithCheese withCheese = new HamburgerWithCheese();
		
		withCheese.doIt();
	}
	
	public void orderHamburgerWithBacon() {
		HamburgerWithBacon bacon = new HamburgerWithBacon();
		
		bacon.doIt();
	}

	public void orderHamburgerWithBaconAndCheese() {
		HamburgerWithBaconAndCheese bacon = new HamburgerWithBaconAndCheese();
		
		bacon.doIt();
	}
	
}
