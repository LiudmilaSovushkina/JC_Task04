package by.tr.oop.notebook;

import java.util.ArrayList;
import java.util.Objects;

public class Notebook {
	private ArrayList<Note> text = new ArrayList<>();

	public Notebook(ArrayList<Note> text) {
		this.text = text;
	}

	public void setText(ArrayList<Note> text) {
		this.text = text;
	}

	public ArrayList<Note> getText() {
		return text;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Notebook notebook = (Notebook) o;
		return Objects.equals(text, notebook.text);
	}

	@Override
	public int hashCode() {
		return Objects.hash(text);
	}

	@Override
	public String toString() {
		return "" + text;
	}
}
