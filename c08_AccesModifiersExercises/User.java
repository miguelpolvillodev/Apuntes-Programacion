package c08_AccesModifiersExercises;

public class User {

	private String user;
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public void checkPassword(String inputPassword) {
		
		if (password.compareTo(inputPassword) == 0) {
			System.out.println("Contraseñas iguales");

		} else {
			System.out.println("No son iguales");
		}
	}

}
