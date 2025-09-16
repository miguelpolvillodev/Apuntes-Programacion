package c08_AccesModifiersExercises;

public class Temperature {

	private double celsius;

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		if (celsius <= 100 && celsius >= -100) {
			this.celsius = celsius;
			System.out.println(celsius + " Celsius");
		} else {
			System.out.println("Valor incorrecto");
		}

	}
}
