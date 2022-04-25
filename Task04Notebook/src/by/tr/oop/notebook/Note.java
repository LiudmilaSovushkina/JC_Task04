package by.tr.oop.notebook;

import java.util.Objects;

public class Note {

	private String note;
	private int date;
	private int month;
	private int year;

	public Note(String note, int date, int month, int year) {
		this.note = note;
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getDate() {
		return date;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		String stringNote = "Запись: " + note + " Дата записи: " + date + "." + month + "." + year + "\n";
		return stringNote;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Note note1 = (Note) o;
		return Objects.equals(note, note1.note) && Objects.equals(date, note1.date);
	}

	@Override
	public int hashCode() {
		return Objects.hash(note, date, month, year);
	}
}
