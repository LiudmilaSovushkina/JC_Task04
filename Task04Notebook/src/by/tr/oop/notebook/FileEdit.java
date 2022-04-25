package by.tr.oop.notebook;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class FileEdit {
	
	private Notebook text;

	File file = new File("D:\\", "File.txt");

	public void addToFile(Notebook text) {

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			PrintWriter out = new PrintWriter(file.getAbsoluteFile());

			try {
				out.print(text);
			} finally {

				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void deleteNote(ArrayList<Note> text, int noteIndex) {
		text.remove(noteIndex);
	}
	
	public Notebook getText() {
		return text;
	}

	public void setText(Notebook text) {
		this.text = text;
	}
}
