package behavioral.strategy.v1;

public class ConcreteStrategyAdd implements Strategy {

	@Override
	public int execute(int a, int b) {
		return a + b;
	}

}
