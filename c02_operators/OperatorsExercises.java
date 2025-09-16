package c02_operators;

public class OperatorsExercises {

	public static void main(String[] args) {

		// 1. Crea una variable con el resultado de cada operación aritmética.
int a = 10;
int b = 5;

int suma = a + b;
int resta = a - b;
int multi = a * b;
int division = a / b;
int resto = a % b;

		// 2. Crea una variable para cada tipo de operación de asignación.
a = b;
a += 1;
a -= 1;
a *= 1;
a /= 1;
a %= 1;

		// 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
System.out.println(5 > 0);
System.out.println(0 < 5);
System.out.println(5 == 5);

		// 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
System.out.println(5 != 5);
System.out.println(5 > 10);
System.out.println(5 == 10);

		// 5. Utiliza el operador lógico and.
System.out.println(true && true);

		// 6. Utiliza el operador lógico or.
System.out.println(false || true);

		// 7. Combina ambos operadores lógicos.
System.out.println((true && true) || (false && true));

		// 8. Añade alguna negación.
System.out.println((true && false) || (false && true));

		// 9. Imprime 3 ejemplos de uso de operadores unarios.
System.out.println(++b);
System.out.println(--b);
System.out.println(-b);

		// 10. Combina operadores aritméticos, de comparación y lógicos.
int c = 6;
int d = 2;
	
int sum2 = c + d;
	
System.out.println((sum2>0 && true) || (6!=0 && true));

	}

}
