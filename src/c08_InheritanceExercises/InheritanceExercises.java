package c08_InheritanceExercises;

import java.util.ArrayList;

import c08_InheritanceExercises.Account.SavingsAccount;
import c08_InheritanceExercises.Animal.Cat;
import c08_InheritanceExercises.Animal.Dog;
import c08_InheritanceExercises.Bird.Eagle;
import c08_InheritanceExercises.Device.Phone;
import c08_InheritanceExercises.Employee.Manager;
import c08_InheritanceExercises.Person.Student;
import c08_InheritanceExercises.Vehicle.Bike;
import c08_InheritanceExercises.Vehicle.Car;
import c08_InheritanceExercises.Vehicle.Truck;

public class InheritanceExercises {

	public static void main(String[] args) {
		
		// 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
Vehicle vehicle = new Vehicle();
vehicle.move();

Car car = new Car();
car.move();
car.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
Person person= new Person();

Student student = new Student ("Miguel", 26, "4ºB");
student.study();
		
        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
Animal animal = new Animal();

Dog dog = new Dog("Dog","Woof");
dog.makeSound();

Cat cat = new Cat("Cat","Meow");
cat.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
Employee employee = new Employee();
employee.name = "Marta";
employee.salary = 950;
employee.sayEmploye();

Manager manager = new Manager();
manager.name = "Antonio";
manager.salary = 1200;
manager.department = "Gestiones";
manager.sayManager();

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
Shape circle = new Circle (5);
Shape rectangle = new Rectangle (4,6);

System.out.println("Área del círculo: " + circle.calculateArea());
System.out.println("Área del rectángulo: " + rectangle.calculateArea());

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
Bird bird = new Bird ();
Eagle eagle = new Eagle ();

bird.fly();
eagle.fly();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
Device device = new Device ();
Phone phone = new Phone ();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
Account account = new Account ();
account.saldo = 1000;

account.deposit(200);
account.withdraw(200);

SavingsAccount savingsAccount = new SavingsAccount();
savingsAccount.saldo = 1000;

savingsAccount.addInterest(0.05);

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
car.describe();
Bike bike = new Bike ();
bike.describe();
Truck truck = new Truck ();
truck.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
ArrayList<Animal> animals = new ArrayList<>();

animals.add(new AnimalesAL.Perro("perro", "guau"));
animals.add(new AnimalesAL.Gato("gato", "miau"));
animals.add(new AnimalesAL.Pajaro("pájaro", "pío"));

for (Animal animalal : animals) {
    animalal.makeSound();
}
}

	}


