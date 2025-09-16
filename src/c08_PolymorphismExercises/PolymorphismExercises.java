package c08_PolymorphismExercises;

import java.util.ArrayList;

import c08_PolymorphismExercises.Animal.Cati;
import c08_PolymorphismExercises.Animal.Cowi;
import c08_PolymorphismExercises.Animal.Dogi;
import c08_PolymorphismExercises.Notification.EmailNotification;
import c08_PolymorphismExercises.Notification.SMSNotification;
import c08_PolymorphismExercises.Personaje.Archer;
import c08_PolymorphismExercises.Personaje.Mage;
import c08_PolymorphismExercises.Personaje.Warrior;
import c08_PolymorphismExercises.Product.Book;
import c08_PolymorphismExercises.Product.Electronic;
import c08_PolymorphismExercises.Vehicle.Bike;
import c08_PolymorphismExercises.Vehicle.Car;
import c08_PolymorphismExercises.Vehicle.Truck;

public class PolymorphismExercises {

	public static void main(String[] args) {

		// 1. Crea una clase Animal con el método makeSound().
		// Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos
		// diferentes. Llama al método desde una lista de Animal.
Dogi dogi = new Dogi();
dogi.makeSound();
Cati cati = new Cati();
cati.makeSound();
Cowi cowi = new Cowi();
cowi.makeSound();

		// 2. Crea una clase Shape con el método calculateArea().
		// Luego implementa subclases Circle y Rectangle con sus propias fórmulas.
		// Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
Circle circle = new Circle(2);
Rectangle rectangle = new Rectangle(2, 4);
ArrayList<Shape> figuras = new ArrayList<>();
figuras.add(circle);
figuras.add(rectangle);
for (Shape shape : figuras) {
		System.out.println("Area: " + shape.calculateArea());
		}

		// 3. Crea una clase Printer con varios métodos print() sobrecargados que
		// acepten diferentes tipos de parámetros (String, int, double).
		// Llama a cada uno desde main.
Printer printer = new Printer();
System.out.println(printer.imprimir("Hola"));
System.out.println(printer.imprimir(10));
System.out.println(printer.imprimir(2.5));
		
		// 4. Crea una clase Greeter con dos métodos greet(): uno que salude con
		// “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
Greeter greeter = new Greeter();
greeter.greet();
greeter.greet("Miguel");
greeter.greet("Pablo");

		// 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck
		// que sobrescriban ese método.
		// Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
ArrayList<Vehicle> vehicles = new ArrayList<>();
vehicles.add(new Car());
vehicles.add(new Bike());
vehicles.add(new Truck());
for (Vehicle vehicle : vehicles) {
			vehicle.start();

		}

		// 6. Crea una clase Notification con método send(), y subclases
		// EmailNotification, SMSNotification.
		// Luego crea una función sendNotification(Notification n) que reciba cualquier
		// tipo y lo ejecute.
EmailNotification email = new EmailNotification();
SMSNotification sms = new SMSNotification();

		EmailNotification.sendNotification(email);
SMSNotification.sendNotification(sms);

		// 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de
		// animal.
		// Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo
		// con su propio getType() sobrescrito.

Animal2 dog = new Dogy();
Animal2 cat = new Caty();
Animal2 horse = new Horse();

showAnimalType(dog);
showAnimalType(cat);
showAnimalType(horse);

		// 8. Crea una clase Converter con métodos convert(int), convert(double), y
		// convert(String) que devuelvan diferentes formatos de texto.
Converter converter = new Converter();
converter.convert(2);
converter.convert(2.5);
converter.convert("Miguel");

	// 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic
	// deben sobrescribirlo con su propia lógica de descuento.
	// Recorre una lista de Product e imprime el precio final de cada uno.
Product product = new Product();
Book book = new Book();
Electronic electronic = new Electronic();
ArrayList<Product> productos = new ArrayList<>();
productos.add(book);
productos.add(electronic);
for (Product producto : productos) {
	producto.getPrice();
}

	// 10. Crea una clase Character con método attack(). Luego crea subclases
	// Warrior, Archer, Mage con ataques diferentes.
	// En main, crea un array de Character y llama a attack() para cada uno.

Personaje personaje = new Personaje();
Warrior warrior = new Warrior();
Archer archer = new Archer();
Mage mago = new Mage();
ArrayList<Personaje> personajes = new ArrayList<>();
personajes.add(warrior);
personajes.add(archer);
personajes.add(mago);
for (Personaje p : personajes) {
	p.attack();
}



	}
	public static void showAnimalType(Animal2 animal) {
		System.out.println("Tipo de Animal: " + animal.getType());
	}
}
