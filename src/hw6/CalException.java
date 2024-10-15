package hw6;

import java.util.InputMismatchException;

public class CalException extends InputMismatchException{
	
	public CalException() {
		
	}
	public CalException(String message) {
		super(message);
	}
	
}
