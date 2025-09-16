package c09_exceptions;

public class Exceptions {

	public static void main(String[] args) {

		// Manejo de excepciones
		
		// try catch
		try {
			var result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Cuidado con dividir algo que no puedes: " + e);
		}
		
		// try con multiples catch
		try {
			var result = 10 / 5;
			System.out.println(result);
			
			var name = "Brais";
			name = null;
			System.out.println("Name: " + name.toUpperCase());
			
		} catch (ArithmeticException e) {
			System.out.println("Cuidado con dividir algo que no puedes: " + e);
		} catch (NullPointerException e) {
			System.out.println("Ha ocurrido un null pointer mitico: " + e);
		} catch (Exception e) {
			System.out.println("Se ha producido un error inesperado");
		}
		
		
		// finally
		try {
			var result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Cuidado con dividir algo que no puedes: " + e);
		} finally {
			System.out.println("Fin del bloque try-catch");
		}
		
		
		// throw
		var throwExample = new ThrowExample();
		try {
			throwExample.checkAge(15);
		} catch (IllegalArgumentException e) {
			System.out.println("Error revisando la edad: " + e.getMessage());
		}
		
		
		// Excepcion personalizada
		try {
			throwExample.checkScore(101);
		} catch (CustomException e) {
			System.out.println("Error revisando la puntuacion: " + e);
			
		}
		
		
	}

}
