package c08_oop;

public class Abstraction {

	public static void main(String[] args) {

		// Abstracción

		// - Clase abstracta

		Dog dog = new Dog();
		dog.sleep();
		dog.sound();

		Cat cat = new Cat();
		cat.sleep();
		cat.sound();

		// - Interface

	}

	// - Clase abstracta
	public static abstract class Animal {

		public abstract void sound();

		public void sleep() {
			System.out.println("El animal esta durmiendo");
		}

	}

	public static class Dog extends Animal {

		@Override
		public void sleep() {
			System.out.println("El perro esta durmiendo");
		}

		@Override
		public void sound() {
			System.out.println("Guau");

		}

	}

	public static class Cat extends Animal {
		@Override
		public void sleep() {
			System.out.println("El gato esta durmiendo");
		}

		@Override
		public void sound() {
			System.out.println("Miau");

		}
	}

	// - Interface

	public interface Flying {

		void fly();
	}
	
	public interface Flying2 {

		void fly2();
	}
	public static class Bird extends Animal implements Flying, Flying2 {
		
		@Override
		public void sound() {
			System.out.println("Pio Pio");
		}
		
		@Override
		public void fly() {
			System.out.println("El pajaro vuela");
		}

		@Override
		public void fly2() {
			// TODO Auto-generated method stub
			
		}
	}

	public static class Bat extends Animal implements Flying {
		@Override
		public void sound() {
			System.out.println("Soy Batman");
		}
		
		@Override
		public void fly() {
			System.out.println("El murcielago vuela");
		}
	}

}
