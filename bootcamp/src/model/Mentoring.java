package model;

import java.time.LocalDate;

public class Mentoring extends Content {
	
	private LocalDate date;

	public Mentoring(String title, String description, LocalDate date) {
		super(title, description);
		this.date = date;

	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double returnXP() {
		double xp = Content.getXp() + 20d;
		return xp;
	}

	public String toString() {
		String text = "Mentoria: " + this.getTitle() + "\n";
		text += "Descrição: " + this.getDescription() + "\n";
		text += "Data: " + this.date;
		return text;
	}

}
