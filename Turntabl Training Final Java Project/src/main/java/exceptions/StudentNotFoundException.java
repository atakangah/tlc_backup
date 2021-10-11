package main.java.exceptions;

public class StudentNotFoundException extends Exception {
	
	public StudentNotFoundException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
