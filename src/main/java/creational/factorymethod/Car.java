package creational.factorymethod;


abstract class Car {
    String make;
    double price;

    abstract double getPrice();

    void calculatePrice() {
        System.out.println("Make: " + make + ", price plus premium: " + getPrice());
    }
}
