package creational.singleton;

/**
 * Created by filip on 20.02.2017.
 */
public class Singletone {

    public final String PROPERTY1 = "SINGLETONE.PROPERTY1";

    private Singletone() {
    }

    private static class SingletonHolder {
        private static final Singletone INSTANCE = new Singletone();
    }

    public static Singletone getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
