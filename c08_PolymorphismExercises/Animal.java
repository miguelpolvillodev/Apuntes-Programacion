package c08_PolymorphismExercises;

public class Animal {

	public void makeSound() {
		System.out.println("Algun sonido");
	}

	public static class Dogi extends Animal {

		@Override
		public void makeSound() {
			System.out.println("Guau");
		}
	}
	
	public static class Cati extends Animal {

		@Override
		public void makeSound() {
			System.out.println("Miau");
		}
	}
	
	public static class Cowi extends Animal {

		@Override
		public void makeSound() {
			System.out.println("Muuuu");
		}
	}
	
	
	
}


