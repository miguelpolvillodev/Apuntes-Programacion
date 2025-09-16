package c08_AbstractionExercises;

import java.util.ArrayList;

public class AbstractionExercises {

	public static void main(String[] args) {

		// 1. Crea una clase abstracta Shape con el método calculateArea().
		// Luego implementa dos subclases: Circle y Rectangle, y haz que cada una
		// calcule su propia área.
ArrayList<Shape> shapes = new ArrayList<>();
shapes.add(new Circle(2));
shapes.add(new Rectangle(3, 4));
for (Shape s : shapes) {
System.out.println("Area: " + s.calculateArea());
}

		// 2. Crea una interfaz Playable con el método play(). Luego implementa esa
		// interfaz en dos clases: Guitar y Piano.
		// Cada una debe mostrar un mensaje diferente al ejecutarse.
interface Playable {
void play();
}
	class Guitar implements Playable {
		@Override
		public void play() {
				System.out.println("🎸 Guitar is playing a solo!");
			}
		}
	
	class Piano implements Playable {
		@Override
		public void play() {
				System.out.println("🎹 Piano is playing a melody!");
			}
		}
		
Playable guitar = new Guitar();
Playable piano = new Piano();

guitar.play();
piano.play();

		// 3. Define una clase abstracta Animal con el método makeSound().
		// Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de
		// Animal para mostrar polimorfismo.
ArrayList<Animal> animales = new ArrayList<>();
animales.add(new Dog());
animales.add(new Cat());
for (Animal a : animales) {
a.makeSound();
}

		// 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y
		// Triangle que muestren cómo se dibuja cada figura usando draw().
interface Drawable {
void draw();
}

	class Circulo implements Drawable {
		@Override
		public void draw() {
			System.out.println("Dibuja un circulo");
			}
		}

	class Square implements Drawable {
		@Override
		public void draw() {
			System.out.println("Dibuja un cuadrado");
			}
		}

	class Triangle implements Drawable {
		@Override
		public void draw() {
			System.out.println("Dibuja un triangulo");
			}
		}

Drawable circulo = new Circulo();
Drawable square = new Square();
Drawable triangle = new Triangle();

circulo.draw();
square.draw();
triangle.draw();

		// 5. Crea una clase abstracta Employee con un método calculateSalary().
		// Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para
		// calcular el salario.
Employee fulltime = new FullTimeEmployee("Alice", 3000);
Employee parttime = new PartTimeEmployee("Bob", 20, 80);
System.out.println(fulltime.name + " gana: " + fulltime.calculateSalary());
System.out.println(parttime.name + " gana: " + parttime.calculateSalary());

		// 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y
		// Robot implementen ese método con comportamientos diferentes.
interface Movable {
void move();
}

	class Car implements Movable {
		@Override
		public void move() {
			System.out.println("El coche se mueve");
			}
		}

	class Robot implements Movable {
		@Override
		public void move() {
			System.out.println("El robot se mueve");
			}
		}

Movable car = new Car();
Movable robot = new Robot();

car.move();
robot.move();

		// 7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
		// Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
TV tv = new TV();
tv.turnOn();
tv.turnOff();
WashingMachine wm = new WashingMachine();
wm.turnOn();
wm.turnOff();

		// 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que
		// implemente ambas interfaces y muestre cómo puede volar y nadar.
interface Flyable {
void fly();
}

interface Swimmable {
void swim();
}

	class Duck implements Flyable, Swimmable {
		@Override
		public void fly() {
			System.out.println("El pato vuela");
			}

		@Override
		public void swim() {
			System.out.println("El pato nada");
			}
		}

Duck duck = new Duck();
duck.fly();
duck.swim();

		// 9. Crea una clase abstracta Document con el método print(). Luego crea
		// PDFDocument y WordDocument, cada una con su forma de imprimir.
PDFDocument pdf = new PDFDocument();
pdf.print();
WordDocument word = new WordDocument();
word.print();

		// 10. Crea una interfaz Payable con el método pay().
		// Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un
		// mensaje de pago diferente.
interface Pagable {
void pay();
}

	class Invoice implements Pagable {
		@Override
		public void pay() {
			System.out.println("Factura");
			}
		}
	class EmployeePayment implements Pagable {
		@Override
		public void pay() {
			System.out.println("Pago del trabajador");
			}

		}

Invoice invoice = new Invoice();
invoice.pay();
EmployeePayment employee = new EmployeePayment();
employee.pay();
	}
}
