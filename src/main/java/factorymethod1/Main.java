package factorymethod1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String args[]) throws IOException {
        CarFactory carFactory = new CarFactory();

        System.out.println("Enter the make of car");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String carMake = br.readLine();
        Car car = carFactory.getCar(carMake);
        if (car != null) {
            car.calculatePrice();
        }
    }

}
