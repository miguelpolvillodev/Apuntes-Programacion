package c08_ClassesExercises;

import java.util.ArrayList;
import java.util.List;

import c08_oop.Person;

public class ClassesExercises {

	public static void main(String[] args) {
		
		// 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
var book = new Book ("El enanito", "Javi Suárez");
book.sayHello();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
var dog = new Dog ();
dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        // 4. Crea una clase Car con atributos brand y model y un método showData().
var car = new Car ();
car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
var student = new Student (60);
student.siAprueba();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
var bankAccount = new BankAccount ();
bankAccount.deposit();

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
var rectangle = new Rectangle ();
rectangle.showArea();
rectangle.showPer();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
var worker = new Worker();
worker.showSalario();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
Person person = new Person("Miguel", 26);
Person person2 = new Person ("Raul", 28);

List<Person> names = new ArrayList<>();
names.add(person);
names.add(person2);

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
var product = new Product();
product.showSale();

	}

}
