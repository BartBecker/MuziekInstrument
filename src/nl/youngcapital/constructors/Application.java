package nl.youngcapital.constructors;

import nl.youngcapital.muziek.model.Person;

public class Application {
	
	public static void main(String[] args) {
		
		Person piet = new Person();
		System.out.println(piet.getName());
		
		Person bart = new Person();
		System.out.println(bart.getName());
		bart.setAge(-3);
		System.out.println(bart.getAge());
	}

}
