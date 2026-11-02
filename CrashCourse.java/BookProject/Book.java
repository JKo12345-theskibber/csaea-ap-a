public class Book {
    // 4 private variables
    private String title;
    private int pages;
    private double price;
    private boolean isHardcover;

    // constructor, sets all of them
    public Book(String title, int pages, double price, boolean isHardcover) {
        this.title = title;
        this.pages = pages;
        this.price = price;
        this.isHardcover = isHardcover;
    }

    // toString
    public String toString() {
        return title + " (" + pages + " pages, $" + price + ", " + coverType() + ")";
    }

    // prints the book using toString
    public void printInfo() {
        System.out.println(this.toString());
    }

    // indexOf returns -1 if the word isnt found
    public boolean containsWord(String word) {
        return title.indexOf(word) != -1;
    }

    // gets the first word of the title
    // if theres no space indexOf gives -1 so the whole title is the word
    public String getFirstWord() {
        int space = title.indexOf(" ");
        if (space == -1) {
            return title;
        }
        return title.substring(0, space);
    }

    // substring inside of indexOf
    // checks if the title starts with the first 3 letters of the other word
    public boolean startsLike(String other) {
        return title.indexOf(other.substring(0, 3)) == 0;
    }

    // .equals to compare 2 strings
    public boolean sameTitle(Book other) {
        return this.title.equals(other.title);
    }

    // math with the double
    public double priceWithTax(double taxRate) {
        return price + (price * taxRate);
    }

    // math with the int and the double
    public double pricePerPage() {
        return price / pages;
    }

    // uses the boolean
    public String coverType() {
        if (isHardcover) {
            return "Hardcover";
        }
        return "Paperback";
    }
}
