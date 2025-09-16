package c08_oop;

public class Person {

	// Atributos
	String name;
	int age;
	String id;
	
	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	// Métodos
	public void sayHello() {
		System.out.println("Hola soy " + name + " y tengo "+ age + " años");
	}
	
	// Getter
	public String getId() {
		return id;
	}
	
	// Setter
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Edad no válida");
		}
	}
	
}
