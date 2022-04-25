package by.tr.oop.notebook;

import java.io.File;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NotebookTest {

	private final ArrayList<Note> notes = new ArrayList<>();

	private Note note1;
	private Note note2;

	@BeforeAll
	public void setUp() {
		note1 = new Note("1", 1, 1, 1);
		note2 = new Note("2", 2, 2, 2);
	}

	@Test
	public void verifyCreateNote() {
		Note testNote = new Note("Note", 1, 1, 2021);
		Assertions.assertNotNull(testNote, "Must not be null");
	}

	@Test
	public void verifyAddNoteToNotebook() {
		notes.add(note1);
		notes.add(note2);
		int real = notes.size();
		int expected = 2;
		Assertions.assertEquals(expected, real);
	}

	@Test
	public void existFile() {
		File file = new File("File.txt");
		boolean real = file.exists() && file.isFile();
		boolean expected = true;
		Assert.assertEquals(expected, real);
	}

}
