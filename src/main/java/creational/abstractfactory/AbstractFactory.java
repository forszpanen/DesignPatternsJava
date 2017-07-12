package creational.abstractfactory;

/**
 * Created by filip on 20.02.2017.
 */
public abstract class AbstractFactory {
    public final static int E46 = 1;
    public static final int E39 = 2;

    public static final AbstractFactory getFactory(int factory) {
        switch (factory) {
            case E46:
                return new FactoryBmwE46();
            case E39:
                return new FactoryBmwE39();
            default:
                throw new IllegalArgumentException();
        }
    }


    public abstract CarEngine createEngine();

    public abstract CarDoor createDoor();
}
