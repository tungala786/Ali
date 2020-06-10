package oops;
import inheritance.*;
public class A {
    protected int a=10;
    protected void print() {
    	System.out.println(a*2);
    }
	public static void main(String[] args) {
		
          A obj = new A();
          System.out.println(obj.a);  //protected variable
          obj.print();  //protected method
		
	}

}
