package model;

/**
 * @author Tainan
 *
 */
public class Course extends Content {

	private int courseLoad;	
		
	/**
	 * @param title
	 * @param description
	 * @param courseLoad
	 */
	public Course(String title, String description, int courseLoad) {
		super(title, description);
		this.courseLoad = courseLoad;
	}

	/**
	 * @return courseLoad
	 */
	public int getCourseLoad() {
		return courseLoad;
	}

	public void setCourseLoad(int courseLoad) {
		this.courseLoad = courseLoad;
	}


	public double returnXP() {
		double xp = Content.getXp() * this.courseLoad;
		return xp;
	}
	
	public String toString() {
		String text = "Curso: " + this.getTitle() + "\n";
		text += "Descrição: " + this.getDescription() + "\n";
		text += "Carga horária: " + this.courseLoad;
		return text;
		
	}

}
