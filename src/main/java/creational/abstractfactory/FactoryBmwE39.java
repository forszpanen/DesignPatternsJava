package creational.abstractfactory;

/**
 * Created by filip on 20.02.2017.
 */
public class FactoryBmwE39 extends AbstractFactory {
    public CarEngine createEngine() {
        return new CarEngineE39();
    }

    public CarDoor createDoor() {
        return new CarDoorE39();
    }
}
