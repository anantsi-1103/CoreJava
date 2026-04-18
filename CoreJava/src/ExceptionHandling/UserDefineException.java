package ExceptionHandling;

public class UserDefineException {
	public static void main(String[] args) {
		try {
			checkAge(7);
		} catch (Exception e) {
			System.out.println("Exception Caught " + e);
		}
	}

	static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
//			manually exception ko throw krna ho 
			throw new InvalidAgeException("Below 18 age is not allowed");
		} else {
			System.out.println("Allowed");
		}
	}
}

class InvalidAgeException extends Exception {
	InvalidAgeException(String message) {
		super(message);
	}
}