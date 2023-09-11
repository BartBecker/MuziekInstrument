package nl.youngcapital.scoping;

public class Application {
	
	public static void main(String[] args) {
		
		int age = 45;
		
		for(int i = 0;i<10;i++) {
			System.out.println(i+ age);
			
			String name = "poedel";
			System.out.println(name);
		}
		
		System.out.println(age);
		
		// variable name is hier NIET meer gedefineerd. niet meer benaderbaar.
		
		//String name = "poedel";
		//System.out.println(name);
	}

}
