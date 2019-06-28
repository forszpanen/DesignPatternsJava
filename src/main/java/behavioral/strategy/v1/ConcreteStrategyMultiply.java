package behavioral.strategy.v1;

public class ConcreteStrategyMultiply implements Strategy{

	@Override
	public int execute(int a, int b) {
		return a * b;
	}

}
