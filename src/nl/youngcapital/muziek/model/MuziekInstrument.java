package nl.youngcapital.muziek.model;

public class MuziekInstrument {
	
	
    public String color;
    public double price;
    public boolean oud;
   
    // een gedrag van een object defineer je in een zo method (NL: merhode)
    /*
      syntax:
      <access modifier> <return type> <name>(){
       de inmplementatie van het gedrag
      }
      
     */
    
    public String play() {
    	return "Playing a muziekinstrument, tralalala";
    }
    
    public void komtNietsUit() {
    	System.out.println("Dit is geen resultaat");
    }

}
