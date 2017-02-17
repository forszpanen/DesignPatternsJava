package factorymethod1;


class CarBMW extends Car {

    CarBMW(String make, double price) {
        this.make = make;
        this.price = price;
    }

    public double getPrice() {
        return price * 2;
    }
}
