package behavioral;

/**
 * Created by filip on 28.02.2017.
 */
public class Main {
    public static void main(String args[]) {

        Strategy[] algorithms = {new Impl1(), new Impl2()};
        for (Strategy strategy : algorithms) {
            strategy.solve();
        }
    }
}
