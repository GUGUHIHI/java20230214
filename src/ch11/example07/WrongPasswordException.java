package ch11.example07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		
	}
	public WrongPasswordException(String message) {
		super(message);
	}
}
