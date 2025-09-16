package c05_structures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		
		// Declaracion y creacion
		ArrayList<String> names = new ArrayList<>();
		var numbers = new ArrayList<Integer>();
		
		// Tamaño
		System.out.println(names.size());
		
		// Añadir elementos
		names.add("Brais");
		names.add("Moure");
		names.add("MoureDev");
		
		System.out.println(names.size());
		
		// Acceder a los elementos
		System.out.println(names.getFirst());
		System.out.println(names.get(1));
		System.out.println(names.getLast());
		
		// Modificar los elementos
		names.set(2, "mouredev@gmail.com");
		System.out.println(names.getLast());
		
		// Eliminar elementos
		names.remove(2);
		// System.out.println(names.get(2)); // Error
		System.out.println(names.size());
		
		// Buscar elementos
		System.out.println(names.contains("Brais"));
		System.out.println(names.contains("mouredev@gmail.com"));
		
		// Limpiar ArrayList
		names.clear();
		System.out.println(names.size());
		
		
		// Dinamicos y puede contenter distinto tipos de datos
		

	}

}
