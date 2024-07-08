package org.prince.in.impl;

import org.prince.in.Sim;

public class Vodaphone implements Sim{

	public Vodaphone() {
		System.out.println("Vodaphone Object Created");
	}
	
	@Override
	public void calling() {
		System.out.println("Calling using Vodaphone SIM");		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Vodaphone SIM");				
	}

}
