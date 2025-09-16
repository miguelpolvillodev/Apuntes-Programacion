package c10_Extras;

import java.util.Scanner;

import c08_oop.*;

public class Extras {
	
	static String globalName = "mouredev";

	public static void main(String[] args) {

		// Extras

		// null

		String name = "Brais";
		name = null;
		if (name != null) {
			System.out.println(name.toLowerCase());
		}
		
		// import
		
		new Person("Miguel",26);
		new Classes();
		
		// Scanner
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu edad: ");
		
		int age = entrada.nextInt();
		System.out.println("La edad es: " +  age);
		
		// Scope: variables globales y locales
		
		test();
		
		// static
		
		

	}
	
	public static void test() {
		System.out.println(globalName);
	}

}
