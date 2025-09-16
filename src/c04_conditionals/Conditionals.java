package c04_conditionals;

public class Conditionals {

	public static void main(String[] args) {
		
		// Condicionales
		
		// if, else if, else
		
		int age = 18;
		
		if (age > 18) {
			System.out.println("El usuario es mayor de edad");
		} else if (age == 18) {
			System.out.println("El usuario acaba de cumplir 18");
		} else {
			System.out.println("El usuario es menor de edad");
		}
		
		
		// Switch
		
		int day = 2;
		
		switch (day) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			default:
				System.out.println("No es lunes, martes o miercoles");
		}
		
		
		
		

	}

}
