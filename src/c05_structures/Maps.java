package c05_structures;

import java.util.Collection;
import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		
		// Declaracion y creacion
		HashMap<String, String> names = new HashMap<>();
		var numbers = new HashMap <Integer, String>();
		
		// Tamaño
		System.out.println(names.size());
		
		// Añadir elementos
		names.put("Brais", "brais@gmail.com");
		names.put("Moure", "moure@gmail.com");		
		names.put("MoureDev", "mouredev@gmail.com");
		System.out.println(names.size());
		System.out.println(names);
		
		// Acceder a los elementos
		System.out.println(names.get("Moure"));
		System.out.println(names.get("Dev"));
		
		// Verificar elementos
		System.out.println(names.containsKey("Moure"));
		System.out.println(names.containsKey("Dev"));
		
		System.out.println(names.containsValue("moure@gmail.com"));
		
		// Eliminar elementos
		System.out.println(names.remove("Moure"));
		System.out.println(names.remove("MoureDev"));
		System.out.println(names);
		
		// Limpiar HashMap
		names.clear();
		System.out.println(names);
		
		// Modificacion de elementos
		names.put("Brais", "brais@gmail.com");
		System.out.println(names);
		
		names.put("Brais", "braismoure@gmail.com");
		System.out.println(names);
		
		names.replace("Moure", "mouredev@gmail.com"); // Reemplaza el valor si existe
		System.out.println(names);
		
		names.putIfAbsent("Moure", "mouredev@gmail.com"); // Solo lo añade si no existe
		System.out.println(names);
		
		// Otras operaciones
		System.out.println(names.isEmpty());
		Collection<String> values = names.values();
		System.out.println(values);
		
		
		
		
	}

}
