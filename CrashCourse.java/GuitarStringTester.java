public class GuitarStringTester {
    public static void main(String[] args) {
        // five GuitarString objects
        GuitarString string1 = new GuitarString("E", 1, "steel", false);
        GuitarString string2 = new GuitarString("A", 2, "steel", false);
        GuitarString string3 = new GuitarString("D", 3, "nylon", false);
        GuitarString string4 = new GuitarString("G", 4, "steel", true);
        GuitarString string5 = new GuitarString("B", 5, "nylon", false);
        
        // tuneString method
        System.out.println("tuneString()");
        string1.tuneString(82.4);
        string2.tuneString(110.0);
        string3.tuneString(146.8);
        
        // playString method
        System.out.println("playString()");
        string1.playString();
        string4.playString(); // This is broken, so it won't play
        string5.playString(); // Not tuned yet
        
        // adjustTension method
        System.out.println("adjustTension()");
        string1.adjustTension(10.0);
        string4.adjustTension(5.0); // Broken, so can't adjust
        
        //etStringCondition method
        System.out.println("setStringCondition()");
        string4.setStringCondition(false); // Repair the broken string
        string4.playString(); // Now try to play it
        
        // calculateQuality method
        System.out.println("calculateQuality()");
        System.out.println("String 1 quality: " + string1.calculateQuality() + "%");
        System.out.println("String 3 quality: " + string3.calculateQuality() + "%");
        
        // printStringState method
        System.out.println("printStringState()");
        string1.printStringState();
        string2.printStringState();
        
        // getInfo method
        System.out.println("getInfo()");
        System.out.println(string1.getInfo());
        System.out.println(string4.getInfo());
        
        // getter methods
        System.out.println("getter methods");
        System.out.println("String 2 number: " + string2.getStringNumber());
        System.out.println("String 3 tension: " + string3.getTensionLevel());
        System.out.println("String 5 broken: " + string5.getIsBroken());
    }
}