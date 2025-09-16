package c07_functions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {

	public static void main(String[] args) {
		
		// 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
welcome();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
welcomeToUser("Miguel y Marina");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
resta (10, 5);

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
cuadrado (5);

        // 5. Escribe una función que reciba un número y diga si es par o impar.
esPar(3);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
boolean state = sendAgeWithState(18);
System.out.println(state);

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
cadenas ("Hola mi amor");

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
ArrayList<Integer> lista = new ArrayList<>();
lista.add(10);
lista.add(20);
lista.add(30);
lista.add(40);
double media = sendArrayMedia(lista);
System.out.println("La media es: " + media);


        // 9. Escribe un método que reciba un número y retorna su factorial.
factorial(5);

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
ArrayList<String> listy = new ArrayList<>();
listy.add("Miguel");
listy.add("Marina");
listy.add("Chester");
listy.add("Willy");
sendArrayNombres(listy);
System.out.println(listy);


    }
	public static void welcome() {
        System.out.println("Te doy la bienvenida a Java");
	}
	
	public static void welcomeToUser(String user) {
        System.out.println("Hola! " + user);
    }
	
	public static void resta(Integer num, Integer num2) {
        System.out.println("La resta es: " + (num - num2));
    }
	
	public static void cuadrado(Integer num3) {
        System.out.println("El cuadrado de " + num3 + " es: "  + (num3 * num3));
    }
	
	public static void esPar(Integer num4) {
        if (num4 % 2 == 0) {
        	System.out.println("Par");
        	
        } else {
        	System.out.println("Impar");
        }
    }
	
	public static boolean sendAgeWithState(Integer age) {

        if (age >= 18) {
            return true;
        } else {
        	return false;
        }
		
	}
	
	public static void cadenas(String cadena) {
        System.out.println(cadena.length());
    }
	
	public static double sendArrayMedia(ArrayList<Integer> numero) {
		int suma = 0;
        for (Integer numeros: numero) {
        	suma += numeros;
          
        }
       return (double) suma / numero.size();
    }
	
	public static void factorial(Integer facto) {
		int resultado = 1;
		for (int i = 1; i <= facto; i++) {
			resultado *= i;
			
		}
		System.out.println(resultado); 
    }
	
	public static void sendArrayNombres(ArrayList<String> nombre) {
		
	
		
        for (int i = 0; i < nombre.size(); i++) {
        	
        }
	
	}
	
	
	
	
	
}



