package c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Loops {

	public static void main(String[] args) {
		
		// Loops
		
		// - for controlador por contador
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola, Java!");
		}
		
		String[] names = {"Brais", "Moure", "mouredev"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// for-each (Recorrer arrays, sets, maps enteros)
		
		for (String name: names) {
			System.out.println(name);
		}
		
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		for (Integer number: numbers) {
			System.out.println(number);
		}
		
		HashMap<String, String> emails = new HashMap<>();
		emails.put("Brais", "brais@gmail.com");
		emails.put("Moure", "moure@gmail.com");		
		emails.put("MoureDev", "mouredev@gmail.com");
		
		for (Map.Entry<String, String> email: emails.entrySet()) {
			System.out.println(email.getKey());
			System.out.println(email.getValue());
		}
		
		
		// - while
		
		int index = 0;
		while (index < 5) {
			System.out.println("Hola, Java!");
			index ++;
		}
		
		index = 0;
		while (index < names.length) {
			System.out.println(names[index]);
			index++;
		}
		
		index = 0;
		boolean find = false;
		while (!find) {
			System.out.println(names[index]);
			if (names[index].equals("Moure"));{
				find = true;
			}	
			index++;
		}
		
		
		// - do-while
		
		index = 0;
		do {
			System.out.println("Hola Java");
			index++;
		} while (index < 0);
		
		// Control de bucles
		
		// - break;
		
		 for (String name: names) {
	            if (name.equals("Moure")) {
	                break;
	            }
	            System.out.println(name);
	        }
		
		// - continue
		
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
