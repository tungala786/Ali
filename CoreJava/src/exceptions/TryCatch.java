package exceptions;

public class TryCatch {

	public static void main(String[] args) {
		int x=10;
		try {
		System.out.println(x/0);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide a number by zero!");
		}
		finally {
			System.out.println("Executing the finally block!");
		}
		int a[]= {1,2,3};
		try {
		System.out.println(a[3]);
		}catch(Exception e) {
			System.out.println("Invalid index");
		}
		System.out.println("Hello");
		System.out.println("World");

	}

}
