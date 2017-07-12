package behavioral;

/**
 * Created by filip on 28.02.2017.
 */
abstract class TemplateMethod1 implements Strategy {
    public void solve() {
        start();
        stop();
    }

    protected abstract void start();

    protected abstract void stop();
}
