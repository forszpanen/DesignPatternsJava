package factorymethod1;


abstract class Car {
    String make;
    double price;

    abstract double getPrice();

    void calculatePrice() {
        System.out.println("Make: " + make + ", price plus premium: " + getPrice());
    }
}
