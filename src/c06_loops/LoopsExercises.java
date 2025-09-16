package c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {

	public static void main(String[] args) {
		
		// 1. Imprime los números del 1 al 10 usando while.
int index = 1;
while (index <= 10) {
		System.out.println(index);
		index ++;
		}


        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
ArrayList<String> names = new ArrayList<>();
names.add("Pepe");
names.add("Brais");
names.add("Maria");

index = 0;
do {
	System.out.println(names);
	index++;
} while (index < 1);


        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
for (int i = 1; i <= 50; i++) {
    if (i % 5 == 0) {
        System.out.println(i);
    }
}


        // 4. Recorre un Array de 5 números e imprime la suma total.
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
int suma = 0;

for (int i = 0; i < numbers.length; i++) {
	suma += numbers[i];
}
System.out.println("La suma total es: " + suma);


        // 5. Usa un for para recorrer un Array y mostrar sus valores.
String[] nombres = new String [3];
nombres[0] = "Pepe";
nombres[1] = "Antonia";
nombres[2] = "Raul";

for (int i = 0; i < nombres.length; i++) {
	System.out.println(nombres[i]);
}


        // 6. Usa for-each para recorrer un HashSet y un HashMap.
HashSet<String> cities = new HashSet<>();
cities.add("Sevilla");
cities.add("Granada");
cities.add("Huelva");
for (String city: cities) {
	System.out.println(city);
}

HashMap<String, String> emails = new HashMap<>();
emails.put("Brais", "brais@gmail.com");
emails.put("Moure", "moure@gmail.com");		
emails.put("MoureDev", "mouredev@gmail.com");

for (Map.Entry<String, String> email: emails.entrySet()) {
	System.out.println(email);
	
}


        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
for (int i = 10; i >= 1; i--) {
	System.out.println(i);
}
																							System.out.println("");

																							
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
for (int i = 1; i <= 20; i++) {
	if (i % 3 == 0) {
		continue;
	}
	System.out.println(i);
}


        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
Integer[] numeritos = {1, 2, 3, -4, -3, 4};
for (Integer numero: numeritos) {
    if (numero < 0) {
        break;
    }
    System.out.println(numero);
}


        // 10. Crea un programa que calcule el factorial de un número dado.
int num1 = 5;
int factorial = 1;

for (int i = 1; i <= num1; i++) {
	factorial *= i;
}
System.out.println("El factorial de " + num1 + " es: " + factorial);

	}

}
