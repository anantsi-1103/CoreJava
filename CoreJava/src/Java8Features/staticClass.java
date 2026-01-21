package Java8Features;

public class staticClass implements A{
	public static void main(String[] args) {
		staticClass st = new staticClass();
		
		
		
		A.sayHey();
		
	}
}


interface A{
	static void sayHey() {
		System.out.println("heyyy");
	}
}

