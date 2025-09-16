package c03_strings;

public class StringExercises {

	public static void main(String[] args) {
		
		// 1. Concatena dos cadenas de texto.
System.out.println("Hola " + "Java");

        // 2. Muestra la longitud de una cadena de texto.
System.out.println("Miguel".length());

        // 3. Muestra el primer y último carácter de un string.
System.out.println("Miguel".charAt("Miguel".length() - 6));
System.out.println("Miguel".charAt("Miguel".length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
String name = "mIGUEL";
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
System.out.println("Hola, como estas?".contains("Hola"));

        // 6. Formatea un string con un entero.
int age = 26;
System.out.println(String.format("Hola tengo %d años", age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
System.out.println(" Espacio principio, espacio final ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
System.out.println("Reemplazame los espacios con guiones porfa".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
String name1 = "Miguel";
String name2 = "Miguel";
System.out.println(name1.equals(name2));

        // 10. Comprueba si dos strings tienen la misma longitud.
int name3 = "cacao".length();
int name4 = "cacau".length();
System.out.println(name3 == name4);

	}

}
