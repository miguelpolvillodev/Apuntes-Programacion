package c08_oop;

public class Inheritance {

	public static void main(String[] args) {

		// Herencia ("es un ...")

		var animal = new Animal();
		animal.name = "Mi animal";
		animal.eat();

		var dog = new Dog();
		dog.name = "Mou";
		dog.eat();

		var cat = new Cat();
		cat.name = "Cou";
		cat.eat();

		var bird = new Bird();
		bird.name = "Bou";
		bird.eat();
		bird.fly();

	}

	public static class Animal {

		String name;

		public void eat() {
			System.out.println("El animal con nombre " + name + " está comiendo");
		}
	}

	public static class Dog extends Animal {

		public void eat() {
			System.out.println("El perro con nombre " + name + " está comiendo");
		}
	}

	public static class Cat extends Animal {

	}

	public static class Bird extends Animal {

		public void fly() {
			System.out.println("Está volando");
		}
	}

}
