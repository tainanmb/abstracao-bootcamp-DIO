package model;

public abstract class Content {

	protected static final double XP = 10d;
	private String title;
	private String description;
	
	
	/**
	 * Método construtor. Cria objetos do tipo Content.
	 * @param title
	 * @param description
	 */
	public Content(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public static double getXp() {
		return XP;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract String toString(); 
	
	public abstract double returnXP();
		
}
