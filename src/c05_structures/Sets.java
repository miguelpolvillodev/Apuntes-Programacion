package c05_structures;

import java.util.HashSet;

public class Sets {

	public static void main(String[] args) {
		
		// Declaracion y creacion
		HashSet<String> names = new HashSet<>();
		var numbers = new HashSet<Integer>();
		
		// Tamaño
		System.out.println(names.size());
		
		// Añadir elementos
		names.add("Brais");
		names.add("Moure");
		names.add("MoureDev");
		names.add("mouredev@gmail.com");
		System.out.println(names.size());
		System.out.println(names);
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		// Eliminar elementos
		names.remove("Brais");
		System.out.println(names.size());
		
		// Buscar elementos
		System.out.println(names.contains("Brais"));
		System.out.println(names.contains("mouredev@gmail.com"));
		
		System.out.println(names);
		
		names.add("Moure");
		names.add("Moure");
		names.add("Moure");
		System.out.println(names); // No permite repetidos
		
		// Conjuntos
		
		// names.addAll(numbers); // Error
		
		HashSet<String> countries = new HashSet <>();
		countries.add("España");
		countries.add("México");
		countries.add("Argentina");
		countries.add("MoureDev");
		
		names.addAll(countries);
		System.out.println(names);
		
	//	names.removeAll(countries);
		System.out.println(names);
		
		names.retainAll(countries);
		System.out.println(names);
		
		
		
		
		

	}

}
