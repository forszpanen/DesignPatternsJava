package creational.abstractfactory;

/**
 * Created by filip on 20.02.2017.
 */
public class FactoryBmwE46 extends AbstractFactory {
    public static final int E46 = 46;

    public CarEngine createEngine() {
        return new CarEngineE46();
    }

    public CarDoor createDoor() {
        return new CarDoorE46();
    }
}
