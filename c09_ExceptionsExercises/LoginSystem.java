package c09_ExceptionsExercises;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {

    // Simulamos una base de datos de usuarios
    private static Map<String, String> users = new HashMap<>();

    // Método estático para cargar usuarios de ejemplo
    static {
        users.put("admin", "admin123");
        users.put("user1", "pass1");
    }

    // Método de login que lanza una excepción si el login falla
    public static void login(String username, String password) throws LoginFailedException {
    	
        if (!users.containsKey(username) || !users.get(username).equals(password)) {
            throw new LoginFailedException("Error de inicio de sesión: usuario o contraseña incorrectos.");
        } else {
        	System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + username + "!");
        }
        
    }
}
