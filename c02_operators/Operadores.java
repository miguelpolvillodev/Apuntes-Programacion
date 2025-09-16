package c02_operators;

public class Operadores {

	public static void main(String[] args) {

		// Operadores

		// Aritmeticos

		int a = 5;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println((double) a / b);
		System.out.println(a % b);

		// Asignacion (=)

		a = b;
		System.out.println(a);

		a = b * 2;
		System.out.println(a);

		a += 1; // a = a + 1;
		System.out.println(a);

		a -= 1;
		System.out.println(a);
		a *= 2;
		System.out.println(a);
		a /= 2;
		System.out.println(a);
		a %= 2;
		System.out.println(a);

		// Comparacion (Relacionales)

		System.out.println(a == b);
		System.out.println(a == 0);

		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);

		// Lógicos

		// Y (AND)
		System.out.println(true && true); // True
		System.out.println(true && false); // False
		System.out.println(false && true); // False
		System.out.println(false && false); // False

		System.out.println(3 > 2 && 5 == 2);
		
		// O (OR)
		System.out.println(true || true); // True
		System.out.println(true || false); // True
		System.out.println(false || true); // True
		System.out.println(false || false); // False
		
		System.out.println(3 > 2 || 5 == 2);
		
		// NO (NOT)
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(!(3 > 2) || 5 == 2);
		
		// Unarios 
		System.out.println(+b);
		System.out.println(-b);
		System.out.println(++b); // Incrementa antes de imprimir
		System.out.println(b++); // Incrementa despues de imprimir
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b--);
		System.out.println(b);
		
		++b;
		System.out.println(b);

	}

}
