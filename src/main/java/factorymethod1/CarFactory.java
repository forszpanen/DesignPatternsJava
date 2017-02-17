package factorymethod1;


class CarFactory {

    Car getCar(String carMark) {
        if (carMark == null) return null;
        if (carMark.equalsIgnoreCase("BMW")) return new CarBMW(carMark, 10000.0);
        else if (carMark.equalsIgnoreCase("AUDI")) return new CarAudi(carMark, 9000.0);
        else if (carMark.equalsIgnoreCase("VW")) return new CarVW(carMark, 5000.0);
        return null;
    }

}
