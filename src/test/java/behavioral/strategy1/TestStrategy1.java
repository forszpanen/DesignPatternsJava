package behavioral.strategy1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStrategy1 {

	@Test
	public void test() {
		final int a = 10;
		final int b = 5;
		Context context = new Context();
		ConcreteStrategyAdd add = new ConcreteStrategyAdd();
		ConcreteStrategyMultiply multiply = new ConcreteStrategyMultiply();
		ConcreteStrategySubtract subtract = new ConcreteStrategySubtract();
		context.setStrategy(add);
		context.execute(a, b);
		context.setStrategy(multiply);
		context.execute(a, b);
		context.setStrategy(subtract);
		context.execute(a, b);
		
	}

}
