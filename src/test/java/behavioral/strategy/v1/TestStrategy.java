package behavioral.strategy.v1;

import static org.junit.Assert.*;

import org.junit.Test;

import behavioral.strategy.v1.ConcreteStrategyAdd;
import behavioral.strategy.v1.ConcreteStrategyMultiply;
import behavioral.strategy.v1.ConcreteStrategySubtract;
import behavioral.strategy.v1.Context;

public class TestStrategy {

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
