package exceptions;
public class Prop {
    void a() {
    	int a=10;
    	try {
    	System.out.println(a/0);
    	}catch(ArithmeticException e) {
    		System.out.println("Cannot divide a number by zero!");
    	}
    	System.out.println("Hello from a()!");
      }
    void b() {
    	a();
    }
    void c() {
    	b();
    }
	public static void main(String[] args) {
		Prop obj = new Prop();
		obj.c();
		System.out.println("After handling the exception!");
	}

}
