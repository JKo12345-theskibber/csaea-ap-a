public class Email {

    private String address;

    public Email(String address) {
        this.address = address;
    }

    public String toString() {
        return address;
    }

    public int getAtIndex() {
        return address.indexOf("@");
    }

    public String getUser() {
        return address.substring(0, address.indexOf("@"));
    }

    public String getDomain() {
        return address.substring(address.indexOf("@") + 1);
    }

    public boolean isSchool() {
        return getDomain().endsWith(".edu");
    }

    // === challenge 1 ===
    public String getFirstName() {
        String user = getUser();                 
        int dot = user.indexOf(".");            
        return user.substring(0, dot);           
    }

    // === challenge 2 ===
    public String changeDomain(String newDomain) {
        return getUser() + "@" + newDomain;
    }
}

// === challenge 3 ===
public static String getLabel(String email) {
    if (isSchool(email)) {
        return "School: " + getDomain(email);
    } else {
        return "Personal: " + getDomain(email);
    }
}

// === challenge 4 ===
public boolean isStaffFormat() {
    return toString().indexOf("hcvsd.org") != -1 && getUser().indexOf(".") != -1;
}