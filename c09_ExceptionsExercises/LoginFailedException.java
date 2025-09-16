package c09_ExceptionsExercises;

public class LoginFailedException extends Exception {
	
    public LoginFailedException(String message) {
        super(message);
    }
}