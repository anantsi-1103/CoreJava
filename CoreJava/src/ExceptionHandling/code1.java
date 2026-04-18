package ExceptionHandling;

public class code1 {
	public static void main(String[] args) {

		System.out.println("Service Start");

//		0 se divide nhi kr sakthe ho -> Arithmetic Exception
//		System.out.println(10 / 0);

//		String name = null;
//		System.out.println(name.length());

//		int arr[] = { 2, 3, 4, 5, 6 };
//		System.out.println(arr[100]);

		try {
			String str = "abcde";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			System.out.println("Exception Handled " + e);
		}

		System.out.println("Rest of the services");
	}
}
