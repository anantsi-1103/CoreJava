package ExceptionHandling;

public class code2 {
	public static void main(String[] args) {

		System.out.println("Service Start");
		try {

//			int arr[] = new int[5];
//			arr[10] = 59;

			int x = 10 / 0;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (Exception e) {
			System.out.println("General Exception");
		}

		finally {
			System.out.println("Finally");
		}

		System.out.println("Rest of the Services");
	}
}
