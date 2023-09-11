package nl.youngcapital.muziek.model;

public class Person {
	
	private String name;
	private int age;
	
	// Een verplichtingsregel in Java dwing je af met een constructor
	/* Syntax
	 * 
	 * <access modifier> <exact dezelfde naam als de class>(parameters){
	 * 
	 * 		// body
	 * }
	 * 
	 */

	/*public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
*/
	// met getters en setters implementeer
		
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if (age >= 10) {
			this.age = age;
		}
		System.out.println("error");
	}

	public String getName() {
		return name;
	}
	
	public Person() {
		
	}
	
}
