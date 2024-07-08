package org.prince.in.client;

import org.prince.in.Sim;
import org.prince.in.impl.Airtel;
import org.prince.in.impl.Vodaphone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config File loaded....\n");
		
		Airtel airtel = context.getBean("airtel", Airtel.class);
		airtel.calling();
		airtel.data();
		
		System.out.println("**************************************");
		
		Vodaphone vodaphone = context.getBean("voda", Vodaphone.class);
		vodaphone.calling();
		vodaphone.data();
		
		System.out.println("**************************************");
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
	}
}
