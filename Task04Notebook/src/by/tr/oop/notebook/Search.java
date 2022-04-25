package by.tr.oop.notebook;

import java.util.ArrayList;

public class Search {

	public Note searchByDate(ArrayList<Note> notesList, int[] dateArray, Note note) {
		for (int i = 0; i < notesList.size(); i++) {
			note = notesList.get(i);
			if (dateArray[0] == note.getDate() && dateArray[1] == note.getMonth() && dateArray[2] == note.getYear()) {
				note = notesList.get(i);
			}
		}
		return note;
	}

	public Note searchByNote(ArrayList<Note> notesList, Note note, String str) {
		for (int i = 0; i < notesList.size(); i++) {
			note = notesList.get(i);
			String strNote = note.getNote();
			int p = 0;
			while (p != -1) {
				p = strNote.indexOf(str, p);
				if (p != -1) {
					p++;
					note = notesList.get(i);
				}
			}
		}
		return note;
	}

}
