package org.prince.in.impl;

import org.prince.in.Sim;

public class Airtel implements Sim{

	public Airtel() {
		System.out.println("Airtel Class Object Created");
	}
	
	@Override
	public void calling() {
		System.out.println("Calling using Airtel SIM");		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Airtel SIM");				
	}

}
