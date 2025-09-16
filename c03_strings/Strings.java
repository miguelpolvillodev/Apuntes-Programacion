package c03_strings;

public class Strings {

	public static void main(String[] args) {

		// Cadenas de texto

		// Declaracion
		String name = "Brais";
		String surname = new String("Moure");

		
		// Operaciones basicas

		// Concatenacion
		System.out.println(name + " " + surname);

		// Longitud
		System.out.println(name.length());

		// Obtener caracter
		System.out.println(name.charAt(name.length() - 1));

		// Subcadena
		System.out.println(name.substring(2));
		System.out.println(name.substring(1, 3));
		
		// Mayus y minus
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		// Comprobar si contiene
		System.out.println("Hola, Java".contains("Braise"));
		System.out.println("Hola, Java".contains("ava"));
		
		
		// Comparacion
		System.out.println(name.equals("Brais"));
		System.out.println(name.equalsIgnoreCase("brais"));
		
		// == vs .equals
		String a = "Brais";
		String b = "Brais";
		String c = new String ("Brais");
		
		System.out.println(a == b); // True
		System.out.println(a == c); // False
		System.out.println(a.equals(c)); // True (Siempre usar equals para Strings)
		
		
		// Trim (Elimina espacios en blanco)
		System.out.println(" Hola, me llamo Brais ".trim());
		
		// Replace
		System.out.println(" Hola, me llamo Brais ".replace("Brais", "Moure"));
		
		// Format
		int age = 37;
		System.out.println(String.format("Hola, %s. Tengo %d años.", name, age)); // (%s texto) (%d numeros enteros) (%f numeros decimales)
		
		
		
		
	}

}
