package c10_ExtrasExercises;

public class User {
	
	public static final String APP_NAME = "Nombre constante";

	public String username;
	
	public User (String username) {
		this.username = username;
	}
	
	public void mostrarInfo() {
		System.out.println("App: " + APP_NAME);
		System.out.println("Usuario: " + username);
	}

	

}
