package nl.youngcapital.basics;

import nl.youngcapital.muziek.model.*;

public class Application {

    public static void main(String[] args) {
        System.out.println("hello world");
       // syso = hetzelfde maar dan in eclipse
        // ctr spc = helpen
        
        /*
         syntax voor het maken van een object
         <Type> <naam van het object> = new <Type>();
         */
        
        MuziekInstrument instrument = new MuziekInstrument();
        instrument.color = "Bruin";
        instrument.price = 150.00;
        
        System.out.println(instrument.color);
        
        MuziekInstrument instrument2 = new MuziekInstrument();
        instrument2.color = "Red";
        instrument2.price = 300.00;
        
        System.out.println(instrument2.price);
        
        // wat is een variable? iets wat kan veranderen
        
        int age = 55;
        age = age +1;
        System.out.println(age);
        
        short aantalWielen = 10000;
        
        double price = 150.00;
        float myPrice = 153.00f;
       
        
        // Als ik in Java variable type begint met een kleine letter dan is dat een primitieve ook wel genoemd
        // een basistype. vergelijkbaar met een element uit het scheikundige periodieke stelse.
        
        /* Wat zijn de primietieven in Java
         * integralen (van klein naar groot) 
         * bit :: byte (8bit) (van -128 t/m 127)
         * short :: 16bit (-32768 t/m 32767)
         * int :: 32 bit (-2 miljard tot +2 miljard)
         * long :: 64 bit (
         * 
         * Breuken
         * float :: 32 bits floating point
         * double :: 64 bits floating point
         * 
         * 
         * Letters
         * char :: 1 letter (character)
         * 
         * boolean oftewel waar of niet waar en in java is dat true of false
         * 
         */
        
        // Met die basistypes maak jij reference-types of classes
        
        // Methode 
        
        
    }

}
