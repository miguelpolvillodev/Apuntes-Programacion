package c01_begginer;

public class TipoDeDatos {

	public static void main(String[] args) {
		
		// Tipos de datos primitivos
		
		int myInt = 37;
		System.out.println(myInt);

		double myDouble = 1.77;
		System.out.println(myDouble);
		
		//float, long, byte
		
		char myChar = 'a';
		System.out.println(myChar);
		
		boolean myBoolean = true;
		myBoolean = false;
		System.out.println(myBoolean);
		
		String myString = "Hola, Java";
		System.out.println(myString);  // No es un dato primitivo pero se usa mucho
		
		
		
		// Tipo de dato en tiempo de compilacion
		
		System.out.println(myString.getClass().getSimpleName());
	}

}
