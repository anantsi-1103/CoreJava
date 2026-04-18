package ExceptionHandling;

public class throwCode {
	public static void main(String[] args) {
		checkAge(16);
	}

	public static void checkAge(int age) {
		if (age < 18) {
//			manually exception ko throw krna ho 
			throw new ArithmeticException("Below 18 age is not allowed");
		} else {
			System.out.println("Allowed");
		}
	}
}
