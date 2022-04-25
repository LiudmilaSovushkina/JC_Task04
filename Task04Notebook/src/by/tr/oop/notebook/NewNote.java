package by.tr.oop.notebook;

import java.util.Scanner;

public class NewNote extends Note {

	Scanner sc = new Scanner(System.in);

	public NewNote(String note, int date, int month, int year) {
		super(note, date, month, year);
	}

	public Note scanner(Note newNote) {

		System.out.println("Введите текст: ");
		newNote.setNote(sc.nextLine());

		System.out.println("Введите число: ");
		newNote.setDate(sc.nextInt());

		System.out.println("Введите месяц: ");
		newNote.setMonth(sc.nextInt());

		System.out.println("Введите год: ");
		newNote.setYear(sc.nextInt());

		return newNote;
	}
}
