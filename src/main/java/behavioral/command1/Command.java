package behavioral.command1;

public abstract class Command {
	protected Application app;
	protected Editor editor;
	protected String backup;

	public Command(Application app, Editor editor) {
		this.app = app;
		this.editor = editor;
	}

	public void saveBackup() {
		backup = editor.getText();
	}

	public abstract boolean execute();
}
