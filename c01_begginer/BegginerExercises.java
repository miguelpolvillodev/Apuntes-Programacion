package c01_begginer;

public class BegginerExercises {

	public static void main(String[] args) {
		
		 // 1. Declara una variable de tipo String y asígnale tu nombre.
String name = "Miguel";
System.out.println(name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
int age = 26;
System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
double altura = 1.80;
System.out.println(altura);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
boolean myBolean = true;
System.out.println("Me gusta programar? " + myBolean);

        // 5. Declara una constante con tu email.
final String EMAIL = "djzhex@gmail.com";
System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
char myChar = 'M';
System.out.println(myChar);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
String city = "Sevilla";
System.out.println(city);
city = "Malaga";
System.out.println(city);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
int a = 2;
int b = 3;
System.out.println(a+b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
System.out.println(EMAIL.getClass().getSimpleName());
System.out.println(city.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
int num;
num = 10;
System.out.println(num);
	}

}
