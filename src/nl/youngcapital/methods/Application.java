package nl.youngcapital.methods;

import nl.youngcapital.muziek.model.MuziekInstrument;
import nl.youngcapital.muziek.model.Recorder;
import nl.youngcapital.muziek.model.SnaarInstrument;

public class Application {
	
	public static void main(String[] args) {
		 MuziekInstrument instrument = new Recorder();
		 SnaarInstrument instrumentSnaar = new SnaarInstrument();
		 
		 instrument.color = "blue";
		 
		 instrument.komtNietsUit(); // dit print niets
		 
		 //komt iets uit
		 
		 String gespeeldeMuziek = instrument.play();
		 System.out.println(gespeeldeMuziek);
		 
		 System.out.println(instrument.play());
		 
		 int toonhoogte = instrumentSnaar.frettenPositie();
		 System.out.println(toonhoogte);
		 
	}

}
