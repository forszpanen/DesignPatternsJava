package behavioral.command1;

public class PasteCommand extends Command {

	public PasteCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean execute() {
		System.out.println("PasteCommand#execute");
		saveBackup();
		editor.replaceSelection(app.getClipboard());
		return true;
	}

}
