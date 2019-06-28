package behavioral.command.v1;

public class Editor {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getSelected() {
		System.out.println("getSelected");
		return "SELECTED TEXT";
	}

	public void deleteSelection() {
		System.out.println("deleteSelection");
	}
	
	public void replaceSelection(String selection) {
		System.out.println("replaceSelection");
	}
	
}
