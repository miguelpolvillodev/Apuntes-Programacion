package c08_AccesModifiersExercises;

public class Car {

	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelerate(int amount) {
		if (speed >= 120) {
			System.out.println("Velocidad excedida");
		} else {
			speed += amount;
			System.out.println(speed);
		}

	}

	public void brake(int amount) {
		if (speed <= 0) {
			System.out.println("No se puede frenar mas");
		} else {
			speed -= amount;
			System.out.println(speed);
		}

	}

}
