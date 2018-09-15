package behavioral.command1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCommand1 {

	@Test
	public void test() {
		Application app = new Application();
		app.executeBatchCommands();
	}

}
