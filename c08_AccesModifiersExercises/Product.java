package c08_AccesModifiersExercises;

public class Product {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
			System.out.println("El precio del producto es: " + price);
		} else {
			System.out.println("Precio no válido");
		}
		
	}
	
}
