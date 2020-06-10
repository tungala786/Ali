package exceptions;

public class MultipleCatch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		try {
		System.out.println(a[5]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(IllegalStateException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello");
		System.out.println("World");
	}

}
