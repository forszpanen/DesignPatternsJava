package behavioral.command.v1;

public class UndoCommand extends Command {

	public UndoCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean execute() {
		System.out.println("UndoCommand#execute");
		app.undo();
		return false;
	}

}
