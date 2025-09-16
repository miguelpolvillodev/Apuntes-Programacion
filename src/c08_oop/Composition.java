package c08_oop;

public class Composition {

	public static void main(String[] args) {
		
		// Composición ("tiene un...")

		Car car = new Car();
		car.on();
	}
	
	public static class Engine {
		
		public void on() {
			System.out.println("Motor encendido");
		}
	}

	public static class Car extends Engine{
		
		final private Engine engine = new Engine();
		
		public void on() {
			engine.on();
		}
		
	}
}
