package behavioral.command.v1;

public class CutCommand extends Command {

	public CutCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean execute() {
		System.out.println("CutCommand#execute");
		saveBackup();
		app.setClipboard(editor.getSelected());
		editor.deleteSelection();
		return true;
	}

}
