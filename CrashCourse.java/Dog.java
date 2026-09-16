public class Dog {
    // data-attributes
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    // constructor
    Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;
        this.age = 0;
        this.weight = 10.0;
        this.isHungry = true;
        this.isHome = true;
        this.energyLevel = 100;
    }

    //behaviors
    void bark() {
        System.out.println(name + " barks!");
    }

    void scratch() {
        System.out.println(name + " scratches and makes a mess.");
    }

}