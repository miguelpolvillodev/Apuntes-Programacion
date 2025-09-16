package c08_InheritanceExercises;


public class Vehicle {

	public void move() {
		System.out.println("Se está moviendo");
	}

	public static class Car extends Vehicle {
		String grade;

		public void honk() {
			System.out.println("Está pitando");
		}

		public void describe() {
			System.out.println("4 ruedas");
		}
	}

	public static class Bike extends Vehicle {
		String grade;

		public void describe() {
			System.out.println("2 ruedas");
		}
	}

	public static class Truck extends Vehicle {
		String grade;

		public void describe() {
			System.out.println("12 ruedas");
		}
	}

}
