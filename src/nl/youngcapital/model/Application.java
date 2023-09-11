package nl.youngcapital.model;

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
        
        
    }

}
