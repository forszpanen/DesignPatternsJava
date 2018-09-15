package creational.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    enum Fruit {
        A, O, G
    }

    public static void main(String args[]) {

        AbstractFactory abstractFactory = AbstractFactory.getFactory(AbstractFactory.E46);

        System.out.println(AbstractFactory.E46);
        CarEngine carEngine = abstractFactory.createEngine();
        System.out.println(carEngine.toString());
        CarDoor carDoor = abstractFactory.createDoor();
        System.out.println(carDoor.toString());
//int a = Fruit.A.;
        List<? extends Integer> aaa = new ArrayList<Integer>();
        //aaa.add(new Integer(1));

    }

}
