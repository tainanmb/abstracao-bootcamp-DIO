package model;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

	private String name;
	private String description;
	private LocalDate inicialDate = LocalDate.now();
	private LocalDate finaldate = inicialDate.plusDays(45);
	private Set<Dev> subscribedDevs = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();
	
	public Bootcamp ( String name, String description, Set<Content> contents) {
		this.name = name;
		this.description = description;
		this.contents = contents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getInicialDate() {
		return inicialDate;
	}

	public void setInicialDate(LocalDate inicialDate) {
		this.inicialDate = inicialDate;
	}

	public LocalDate getFinaldate() {
		return finaldate;
	}

	public void setFinaldate(LocalDate finaldate) {
		this.finaldate = finaldate;
	}

	public Set<Dev> getSubscribedDevs() {
		return subscribedDevs;
	}

	public void setSubscribedDevs(Set<Dev> subscribedDevs) {
		this.subscribedDevs = subscribedDevs;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}
	
	public String toString() {
		String text = "Bootecamp: " + this.name + "\n";
		text += "Descrição: " + this.description + "\n";
		text += "Data inicial: " + this.inicialDate + "\n";
		text += "Data final: " + this.finaldate + "\n";
		text += "Conteúdos do bootcamp: " + "\n";
		Iterator<Content> iteratorContentList = this.contents.iterator();
		while (iteratorContentList.hasNext()) {
			text += iteratorContentList.next().getTitle() + "\n";
		}
		text += "Desenvolvedores inscritos: " + "\n";
		Iterator<Dev> iteratorDevList = this.subscribedDevs.iterator();
		while (iteratorDevList.hasNext()) {
			text += iteratorDevList.next().getName() + "\n";
		}
		return text;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(contents, description, finaldate, inicialDate, name, subscribedDevs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(description, other.description)
				&& Objects.equals(finaldate, other.finaldate) && Objects.equals(inicialDate, other.inicialDate)
				&& Objects.equals(name, other.name) && Objects.equals(subscribedDevs, other.subscribedDevs);
	}

}
