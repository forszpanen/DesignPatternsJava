package factorymethod1;


class CarVW extends Car {

    CarVW(String make, double price) {
        this.make = make;
        this.price = price;
    }

    double getPrice() {
        return price * 1.05;
    }
}
