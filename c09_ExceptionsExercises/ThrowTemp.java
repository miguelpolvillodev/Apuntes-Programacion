package c09_ExceptionsExercises;

public class ThrowTemp {
	public void checkTemp(int temp) throws TemperatureChecker {
		if (temp < -50 || temp > 50) {
			throw new TemperatureChecker("Temperatura fuera de rango: " + temp);
		} else {
			System.out.println("Temperatura válida: " + temp);
		}
		
	}

}
