package behavioral.command1;

import java.util.ArrayList;
import java.util.List;

public class Application {
	private String clipboard;
	private Editor editor;
	private CommandHistory commandHistory;

	public Application() {
		editor = new Editor();
		commandHistory = new CommandHistory();
	}

	public String getClipboard() {
		return clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
	}


	public void executeBatchCommands() {
		List<Command> commands = new ArrayList<>();
		commands.add(new CopyCommand(this, editor));
		commands.add(new CutCommand(this, editor));
		commands.add(new PasteCommand(this, editor));
		commands.add(new UndoCommand(this, editor));
		commands.forEach(c -> {
			execute(c);
		});
	}

	public void execute(Command command) {
		if(command.execute()) {
			commandHistory.push(command);
		}
	}

	public void undo() {
		Command pop = commandHistory.pop();
		if( pop != null) {
			pop.execute();
		}
	}

}
