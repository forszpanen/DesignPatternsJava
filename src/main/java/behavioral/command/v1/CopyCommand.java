package behavioral.command.v1;

public class CopyCommand extends Command {

	public CopyCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean execute() {
		System.out.println("CopyCommand#execute");
		app.setClipboard(editor.getSelected());
		return false;
	}

}
