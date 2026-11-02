public class BookTester {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", 300, 15.0, true);
        Book b2 = new Book("Dune", 600, 12.0, false);
        Book b3 = new Book("Harry Potter", 300, 15.0, false);

        // toString
        System.out.println("toString");
        System.out.println("expected: Harry Potter (300 pages, $15.0, Hardcover)");
        System.out.println("got: " + b1.toString());
        System.out.println();

        // printInfo
        System.out.println("printInfo");
        System.out.println("expected: Dune (600 pages, $12.0, Paperback)");
        System.out.print("got: ");
        b2.printInfo();
        System.out.println();

        // containsWord
        System.out.println("containsWord true");
        System.out.println("expected: true, got: " + b1.containsWord("Potter"));
        System.out.println("containsWord false");
        System.out.println("expected: false, got: " + b1.containsWord("Dune"));
        System.out.println();

        // getFirstWord
        System.out.println("getFirstWord with a space");
        System.out.println("expected: Harry, got: " + b1.getFirstWord());
        System.out.println("getFirstWord no space");
        System.out.println("expected: Dune, got: " + b2.getFirstWord());
        System.out.println();

        // startsLike
        System.out.println("startsLike true");
        System.out.println("expected: true, got: " + b1.startsLike("Harvest"));
        System.out.println("startsLike false");
        System.out.println("expected: false, got: " + b2.startsLike("Harvest"));
        System.out.println();

        // sameTitle
        System.out.println("sameTitle true");
        System.out.println("expected: true, got: " + b1.sameTitle(b3));
        System.out.println("sameTitle false");
        System.out.println("expected: false, got: " + b1.sameTitle(b2));
        System.out.println();

        // priceWithTax
        System.out.println("priceWithTax (using 0.5 so its easy math)");
        System.out.println("expected: 22.5, got: " + b1.priceWithTax(0.5));
        System.out.println("expected: 18.0, got: " + b2.priceWithTax(0.5));
        System.out.println();

        // pricePerPage
        System.out.println("pricePerPage");
        System.out.println("expected: 0.05, got: " + b1.pricePerPage());
        System.out.println("expected: 0.02, got: " + b2.pricePerPage());
        System.out.println();

        // coverType
        System.out.println("coverType true");
        System.out.println("expected: Hardcover, got: " + b1.coverType());
        System.out.println("coverType false");
        System.out.println("expected: Paperback, got: " + b2.coverType());
    }
}