package c08_PolymorphismExercises;

public class Vehicle {
	public void start() {

	}

	public static class Car extends Vehicle {
		 
		 @Override
		public void start() {
			System.out.println("Coche arrancado");
		}
	}

	public static class Bike extends Vehicle {
		
		@Override
		public void start() {
			System.out.println("Bici arrancada");
		}
	}

	public static class Truck extends Vehicle {
		
		@Override
		public void start() {
			System.out.println("Camion arrancado");
		}
	}
}
