package c08_InheritanceExercises;


public class Person {
	String name;
	int age;

	public static class Student extends Person {
		String grade;

		public Student(String name, int age, String grade) {
			this.name = name;
			this.age = age;
			this.grade = grade;
			
		}

		public void study() {
			System.out.println("El estudiante " + name + " y de edad " + age + " está en " + grade);
		}
	}

}
