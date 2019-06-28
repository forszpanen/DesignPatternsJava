package behavioral.command.v1;

import java.util.Stack;

public class CommandHistory {
	private Stack<Command> history = new Stack<>();
	
	public Command push(Command command) {
		return history.push(command);
	}
	
	public Command pop() {
		return history.pop();
	}
	
}
