package org.prince.in.impl;

import org.prince.in.Sim;

public class Jio implements Sim{

	public Jio() {
		System.out.println("Jio Class Object Created");
	}
	
	@Override
	public void calling() {
		System.out.println("Calling using Jio SIM");		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Jio SIM");				
	}

}
