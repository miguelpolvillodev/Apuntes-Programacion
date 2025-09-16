package c04_conditionals;

public class ConditionalsExercises {

	public static void main(String[] args) {
		// 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
int age = 17;

if(age >= 18) {
	System.out.println("Puede votar");
} else {
	System.out.println("No puede votar");
}
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
int num1 = 11;
int num2 = 10;

if (num2 > num1) {
	System.out.println(num2 + " es mayor");
} else if (num2 < num1) {
	System.out.println(num1 + " es mayor");
} else {
	System.out.println("Son iguales");
}

        // 3. Dado un número, verifica si es positivo, negativo o cero.
int ver = -1;

if (ver > 0) {
	System.out.println("Positivo");
} else if (ver < 0) {
	System.out.println("Negativo");
} else {
	System.out.println("Es 0");
}
        // 4. Crea un programa que diga si un número es par o impar.
int numb = 202;

if (numb % 2 == 0) {
	System.out.println("Es par");	
} else {
	System.out.println("Es impar");
}
        // 5. Verifica si un número está en el rango de 1 a 100.
int number = -2;

if (number <= 100 && number >=1) {
	System.out.println("Está en el rango del 1-100");
} else {
	System.out.println("No está en el rango");
}

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
int diaSemana = 1;

switch (diaSemana) {
	case 1:
		System.out.println("Lunes");
		break;
	case 2:
		System.out.println("Martes");
		break;
	case 3:
		System.out.println("Miercoles");
		break;
	case 4:
		System.out.println("Jueves");
		break;
	case 5:
		System.out.println("Viernes");
		break;
	case 6:
		System.out.println("Sabado");
		break;
	case 7:
		System.out.println("Domingo");
		break;
}
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
int nota = 94;

if (nota <= 100 && nota >=90) {
	System.out.println("Sobresaliente");
} else if (nota <= 89 && nota >= 50) {
	System.out.println("Aprobado");
} else if ( nota <= 49 && nota >=0) {
	System.out.println("Suspenso");
} else {
	System.out.println("Nota incorrecta");
}
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
int yo = 14;
int compi = 18;

if (yo < 15 && compi < 18) {
	System.out.println("No puede");
} else 
	System.out.println("Puede entrar");


        // 9. Crea un programa que diga si una letra es vocal o consonante.
String esVocal = "w";

switch (esVocal) {
case "a": 
	System.out.println("Vocal");
	break;
case "e":
	System.out.println("Vocal");
	break;
case "i":
	System.out.println("Vocal");
	break;
case "o":
	System.out.println("Vocal");
	break;
case "u":
	System.out.println("Vocal");
	break;
default:
	System.out.println("Consonante");
}

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
int number1 = 2;
int number2 = 1;
int number3 = 1;

if(number1 > number2 && number1 > number3) {
	System.out.println("El numero " + number1 + " es el mayor");
} else if (number2 > number1 && number2 > number3) {
	System.out.println("El numero " + number2 + " es el mayor");
} else if (number3 > number1 && number3 > number2) {
	System.out.println("El numero " + number3 + " es el mayor");
} else {
	System.out.println("Los 3 son iguales");
}

	}

}
