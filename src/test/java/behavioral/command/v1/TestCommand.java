package behavioral.command.v1;

import static org.junit.Assert.*;

import org.junit.Test;

import behavioral.command.v1.Application;

public class TestCommand {

	@Test
	public void test() {
		Application app = new Application();
		app.executeBatchCommands();
	}

}
