package c08_ClassesExercises;

public class Product {
	int prize = 40;
	double discount = 0.1;
	double result = prize - discount * prize;

	public void showSale () {
		System.out.println("El articulo con el descuento vale: " + result);
	}
}
