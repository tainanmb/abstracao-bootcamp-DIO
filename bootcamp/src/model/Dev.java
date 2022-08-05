package model;

import java.util.*;

public class Dev {

	private String name;
	private Set<Content> subscribedContents = new LinkedHashSet<>();
	private Set<Content> concludedContents = new LinkedHashSet<>();

	public Dev(String name) {
		this.name = name;
	}

	public void subscribeBootcamp(Bootcamp bootcamp) {
		this.subscribedContents.addAll(bootcamp.getContents());
		bootcamp.getSubscribedDevs().add(this);
	}

	public void advance() {
		Optional<Content> content = this.subscribedContents.stream().findFirst();
		if (content.isPresent()) {
			this.concludedContents.add(content.get());
			this.subscribedContents.remove(content.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}

	public double calcularTotalXp() {
		Iterator<Content> iterator = this.concludedContents.iterator();
		double soma = 0;
		while (iterator.hasNext()) {
			double next = iterator.next().returnXP();
			soma += next;
		}
		return soma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getSubscribedContents() {
		return subscribedContents;
	}

	public void setSubscribedContents(Set<Content> subscribedContents) {
		this.subscribedContents = subscribedContents;
	}

	public Set<Content> getConcludedContents() {
		return concludedContents;
	}

	public void setConcludedContents(Set<Content> concludedContents) {
		this.concludedContents = concludedContents;
	}
	
	public String toString() {
		String text = "Desenvolvedor: " + this.name + "\n";
		text += "Conteúdos inscrito: " + "\n";
		Iterator<Content> iteratorContentList = this.subscribedContents.iterator();
		while (iteratorContentList.hasNext()) {
			text += iteratorContentList.next().getTitle() + "\n";
		}
		text += "Conteúdos concluídos: " + "\n";
		Iterator<Content> iteratorContentList2 = this.concludedContents.iterator();
		while (iteratorContentList2.hasNext()) {
			text += iteratorContentList2.next().getTitle() + "\n";
		}
		text += "Total de XP até o momento: " + this.calcularTotalXp();
		return text;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((concludedContents == null) ? 0 : concludedContents.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subscribedContents == null) ? 0 : subscribedContents.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		if (concludedContents == null) {
			if (other.concludedContents != null)
				return false;
		} else if (!concludedContents.equals(other.concludedContents))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subscribedContents == null) {
			if (other.subscribedContents != null)
				return false;
		} else if (!subscribedContents.equals(other.subscribedContents))
			return false;
		return true;
	}

}
