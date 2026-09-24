public class GuitarString {
    // Instance variables
    private String note;                // String
    private int stringNumber;           // int
    private double frequency;           // double
    private boolean isBroken;           // boolean
    private double tensionLevel;        // double
    private String material;            // String
    
    // Constructor
    public GuitarString(String note, int stringNumber, String material, boolean isBroken) {
        this.note = note;
        this.stringNumber = stringNumber;
        this.material = material;
        this.isBroken = isBroken;
        this.frequency = 0.0;
        this.tensionLevel = 100.0;
    }
    
    // Method 1: Tuning the string (changes attribute)
    public void tuneString(double targetFrequency) {
        if (targetFrequency > 0) {
            frequency = targetFrequency;
            System.out.println("String " + stringNumber + " tuned to " + frequency + " Hz");
        } else {
            System.out.println("Frequency must be positive.");
        }
    }
    
    // Method 2: Adjust tension (changes attribute, takes parameter)
    public void adjustTension(double amount) {
        if (!isBroken) {
            tensionLevel += amount;
            if (tensionLevel > 150.0) {
                tensionLevel = 150.0;
                System.out.println("Warning: String at maximum safe tension!");
            } else if (tensionLevel < 50.0) {
                tensionLevel = 50.0;
                System.out.println("Warning: String tension too low!");
            }
        } else {
            System.out.println("Cannot adjust tension on a broken string.");
        }
    }
    
    // Method 3: Play the string (uses attributes)
    public void playString() {
        if (!isBroken && frequency > 0) {
            System.out.println("Playing " + note + " on string " + stringNumber + " at " + frequency + " Hz");
        } else if (isBroken) {
            System.out.println("Cannot play a broken string.");
        } else {
            System.out.println("String not tuned yet.");
        }
    }
    
    // Method 4: Break or repair string (changes attribute, takes parameter, compound condition)
    public void setStringCondition(boolean broken) {
        if (!broken && isBroken) {
            isBroken = false;
            System.out.println("String " + stringNumber + " has been replaced");
        } else if (broken && !isBroken && tensionLevel > 140.0) {
            isBroken = true;
            System.out.println("String " + stringNumber + " snapped");
        } else if (broken && !isBroken) {
            isBroken = true;
            System.out.println("String " + stringNumber + " damaged.");
        } else if (!broken && !isBroken) {
            System.out.println("String is already in good condition.");
        }
    }
    
    // Method 5: Calculate sound quality (uses attributes)
    public double calculateQuality() {
        if (isBroken) {
            return 0.0;
        } else if (frequency > 0 && tensionLevel >= 80.0 && tensionLevel <= 120.0) {
            return 95.0;
        } else if (frequency > 0 && tensionLevel >= 50.0 && tensionLevel <= 150.0) {
            return 70.0;
        } else {
            return 50.0;
        }
    }
    
    // Method 6: Print current state (concatenation)
    public void printStringState() {
        System.out.println("String " + stringNumber + ": " + note);
        System.out.println("Frequency: " + frequency + " Hz");
        System.out.println("Tension: " + tensionLevel + "%");
        System.out.println("Material: " + material);
        System.out.println("Broken: " + isBroken);
        System.out.println("Quality: " + calculateQuality() + "%");
        System.out.println("---");
    }
    
    // Method 7: Get string info (uses attributes)
    public String getInfo() {
        if (isBroken) {
            return "String " + stringNumber + " (" + note + ") - BROKEN";
        } else {
            return "String " + stringNumber + " (" + note + ") - " + material;
        }
    }
    
    // Getter methods
    public int getStringNumber() {
        return stringNumber;
    }
    
    public boolean getIsBroken() {
        return isBroken;
    }
    
    public double getTensionLevel() {
        return tensionLevel;
    }
}