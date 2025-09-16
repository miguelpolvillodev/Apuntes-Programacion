package c08_AccesModifiersExercises;

public class Student {

	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void isPassed() {
		if (grade >=60) {
			boolean aprobado = true;
			System.out.println(aprobado);
		}else {
			boolean aprobado = false;
			System.out.println(aprobado);
		}
	}
}
