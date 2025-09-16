package c09_ExceptionsExercises;

public class PasswordChecker {

    public static void checkPassword(String pass) throws IllegalArgumentException {
        if (pass == null || pass.length() < 8) {
            throw new IllegalArgumentException("La contraseña es demasiado corta. Debe tener al menos 8 caracteres.");
        } else {
            System.out.println("Contraseña válida.");
        }
    }
}
