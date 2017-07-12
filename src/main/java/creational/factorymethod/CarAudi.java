package creational.factorymethod;


class CarAudi extends Car {

    CarAudi(String make, double price) {
        this.make = make;
        this.price = price;
    }

    double getPrice() {
        return price * 1.5;
    }
}
