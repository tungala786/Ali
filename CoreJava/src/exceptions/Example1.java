package exceptions;

public class Example1 {

	public static void main(String[] args) throws InterruptedException  {
		int x=10;
		Thread.sleep(3000);
		System.out.println(x/0);
		System.out.println("Hello");
		System.out.println("World");
		
	}

}
