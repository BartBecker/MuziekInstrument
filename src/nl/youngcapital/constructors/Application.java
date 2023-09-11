package nl.youngcapital.constructors;

import nl.youngcapital.muziek.model.Person;

public class Application {
	
	public static void main(String[] args) {
		
		Person piet = new Person("piet");
		System.out.println(piet.name);
		
		Person bart = new Person("Bart");
		System.out.println(bart.name);
	}

}
