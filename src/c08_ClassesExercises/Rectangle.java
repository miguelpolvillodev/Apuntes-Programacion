package c08_ClassesExercises;

public class Rectangle {
	int lado1 = 2;
	int lado2 = 4;
	int perimetro = lado1 + lado2 + lado1 +lado2;
	int area = lado1 * lado2;
	
public void showPer () {
	System.out.println("El perimetro es: " + perimetro);
}
public void showArea () {
	System.out.println("El area es: " + area);
}

}
