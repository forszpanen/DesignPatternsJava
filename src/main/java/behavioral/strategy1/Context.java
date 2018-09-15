package behavioral.strategy1;

public class Context {
	private Strategy strategy;

	public void setStrategy(Strategy aStrategy) {
		this.strategy = aStrategy;
	}

	public void execute(int a, int b) {
		System.out.println(strategy.execute(a, b));
	}
}
