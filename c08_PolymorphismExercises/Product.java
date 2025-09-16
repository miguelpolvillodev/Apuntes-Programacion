package c08_PolymorphismExercises;

public class Product {
	public void getPrice() {

	}

	public static class Book extends Product {

		@Override
		public void getPrice() {
			System.out.println("El libro vale 20 euros");
		}
	}

	public static class Electronic extends Product {

		@Override
		public void getPrice() {
			System.out.println("El electrodomestico vale 45 euros");
		}
	}
}
