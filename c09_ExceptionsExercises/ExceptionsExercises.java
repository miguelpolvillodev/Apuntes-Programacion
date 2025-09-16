package c09_ExceptionsExercises;

public class ExceptionsExercises {

	public static void main(String[] args) {

		// 1. Divide dos números almacenados en dos variables. Maneja la división por
		// cero con try-catch.
int num1 = 8;
int num2 = 0;
try {
	int result = num1 / num2;
	System.out.println(result);

} catch (ArithmeticException e) {
	System.out.println(e.getMessage());
}

		// 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el
		// ArrayIndexOutOfBoundsException.
try {
	int[] numbers = new int[3];
	System.out.println(numbers[5]);
} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
}

		// 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el
		// NullPointerException.
try {
	String name = null;
	System.out.println(name.length());
} catch (NullPointerException e) {
	System.out.println(e.getMessage());
}

		// 4. Escribe una función que transforma texto a número. Usa try-catch para
		// manejar entradas no válidas (NumberFormatException).
try {
	String texto = "Miguel";
	int numero = Integer.parseInt(texto);
	System.out.println(numero);
} catch (NumberFormatException e) {
	System.out.println("Error: " + e.getMessage());
}

		// 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o
		// no error.
try {
	String texto = "Miguel";
	int numero = Integer.parseInt(texto);
	System.out.println(numero);
} catch (NumberFormatException e) {
	System.out.println("Error: " + e.getMessage());
} finally {
	System.out.println("El programa ha terminado");
}

		// 6. Usa throw para lanzar un IllegalArgumentException si un número introducido
		// es negativo.
ThrowNegativo throwNeg = new ThrowNegativo();
try {
	throwNeg.checkNeg(-2);
} catch (IllegalArgumentException e) {
	System.out.println(e.getMessage());
}
		// 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si
		// la temperatura es menor a -50 o mayor a 50.
ThrowTemp throwTempe = new ThrowTemp();
try {
	throwTempe.checkTemp(25);
} catch (TemperatureChecker e) {
	System.out.println(e.getMessage());
}

		// 8. Crea un programa con varios bloques catch: uno para ArithmeticException,
		// otro para ArrayIndexOutOfBoundsException.
try {
	var result = 10 / 0;
	System.out.println(result);
} catch (ArithmeticException e) {
	System.out.println(e.getMessage());
}

try {
	int[] numeros = new int[4];
	System.out.println(numeros[6]);
} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
}

		// 9. Crea una función checkPassword(String pass) que lance una excepción si la
		// contraseña es demasiado corta.
PasswordChecker passCheck = new PasswordChecker();
try {
	PasswordChecker.checkPassword("abc123");
} catch (IllegalArgumentException e) {
	System.out.println("Error: " + e.getMessage());
}

		// 10. Implementa una clase LoginSystem que use una excepción personalizada
		// LoginFailedException si el usuario o contraseña son incorrectos.
LoginSystem login = new LoginSystem();
try {
	login.login("admin", "admin123"); // Correcto
	login.login("user1", "wrongpass"); // Incorrecto
} catch (LoginFailedException e) {
	System.out.println(e.getMessage());
}

	}

}
