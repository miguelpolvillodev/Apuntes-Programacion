package c10_ExtrasExercises;

import java.util.Random;
import java.util.Scanner;


public class ExtrasExercises {
	
static String globalMessage = "Mensaje global";
		
	public static void main(String[] args) {
		
		// 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
String name = null;
name = "Miguel";

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
Scanner entrada = new Scanner (System.in);

System.out.println("Introduce tu nombre: ");
String nombre = entrada.nextLine();

System.out.println("Introduce tu edad: ");
int edad = entrada.nextInt();

System.out.println(nombre +", " + edad);

        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
final int MAX_SCORE = 100;
System.out.println(MAX_SCORE);

        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
String localMessage = "Mensaje local";
System.out.println(localMessage);
globalTest();

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
Scanner entrada2 = new Scanner (System.in);
System.out.println("Introduce un numero: ");

int positivo = entrada2.nextInt();


if (positivo > 0) {
	System.out.println("Positivo");
} else {
	System.out.println("Negativo");
}

        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
System.out.println(Static.ocho);

        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
Random random = new Random();
int numeroAleatorio = random.nextInt(10) + 1;
System.out.println(numeroAleatorio);

        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.

        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
User usuario = new User ("miguel123");
usuario.mostrarInfo();


        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.

	}
	public static void globalTest() {
		System.out.println(globalMessage);
	}
}
