package c08_oop;

public class Polymorphism {

	public static void main(String[] args) {

		// Polimorfismo

		// - Polimorfismo por herencia (sobreescritura)

		Animal animal = new Animal();
		animal.sound();

		Dog dog = new Dog();
		dog.sound();

		// - Polimorfismo por sobrecarga (sobrecarga de métodos)

		Calculator calculator = new Calculator();
		System.out.println(calculator.sum(3, 5));
		System.out.println(calculator.sum(3.2, 5.4));
		
	}

		// - Polimorfismo por herencia (sobreescritura

	public static class Animal {
		public void sound() {
			System.out.println("Algun sonido");
		}
	}

	public static class Dog extends Animal {

		@Override
		public void sound() {
			System.out.println("Guau");
		}
	}
	
	

		// - Polimorfismo por sobrecarga (sobrecarga de métodos)

	public static class Calculator {
		public int sum(int a, int b) {
			return a + b;
		}

		public int sum(int a, int b, int c) {
			return a + b + c;
		}

		public double sum(double a, double b) {
			return a + b;
		}

	}

}
