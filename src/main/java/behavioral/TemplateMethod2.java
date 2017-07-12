package behavioral;

/**
 * Created by filip on 28.02.2017.
 */
abstract class TemplateMethod2 implements Strategy {
    public void solve() {
        preProcess();
        postProcess();
    }

    protected abstract void preProcess();

    protected abstract void postProcess();
}
