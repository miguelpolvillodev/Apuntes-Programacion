package c09_ExceptionsExercises;

public class ThrowNegativo {

	public void checkNeg(int number) throws IllegalArgumentException {
		if (number < 0) {
			throw new IllegalArgumentException("Tienes que ser positivo");
		} else {
			System.out.println("Numero positivo");
		}
	}

}
