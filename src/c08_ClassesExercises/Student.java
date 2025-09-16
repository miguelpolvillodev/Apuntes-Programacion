package c08_ClassesExercises;

public class Student {
	int score;

public Student (int score) {
	this.score = score;
}

public void siAprueba () {
	if (score >= 60 ) {
		System.out.println("Aprobado");
	} else {
		System.out.println("Suspenso");
	}
}
}
