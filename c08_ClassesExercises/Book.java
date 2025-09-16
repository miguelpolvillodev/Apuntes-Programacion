package c08_ClassesExercises;

public class Book {
	String tittle;
	String author;
	
public Book (String tittle, String author) {
	this.tittle = tittle;
	this.author = author;
}
	
public void sayHello() {
	System.out.println("El libre se llama " + tittle + " y su autor es: " + author);
}
}
