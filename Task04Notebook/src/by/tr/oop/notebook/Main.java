package by.tr.oop.notebook;

import java.io.*;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) throws IOException  {
		
		ArrayList<Note> notesList = new ArrayList<>();
		
		Notebook notebook = new Notebook(notesList);
				
		Note note1 = new Note("День рождения Иванова  - 1 мая", 23, 4, 2022);
		Note note2 = new Note("Купить хлеб", 20, 5, 2022);
		Note note3 = new Note("Купить соль", 13, 6, 2022);
		Note newNote = new NewNote("", 0, 0, 0);

		newNote = ((NewNote) newNote).scanner(newNote);
				
		notesList.add(note1);
		notesList.add(note2);
		notesList.add(note3);
		notesList.add(newNote);

		FileEdit addNote = new FileEdit();
		FileEdit deleteNote = new FileEdit();
		
		deleteNote.deleteNote(notesList, 1);
		addNote.addToFile(notebook);
	
		Note note = new Note ("", 0, 0, 0);
		
		Search sByDate = new Search();
		Search sByNote = new Search();
		
		int[]dateArray = {13, 6, 2022};
		String str = "хлеб";
		
		sByDate.searchByDate(notesList, dateArray, note);
			
		sByNote.searchByNote(notesList, note, str);
					
	}
}
