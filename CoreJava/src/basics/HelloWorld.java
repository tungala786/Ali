package basics;
import oops.*;
public class HelloWorld extends A{
    void hai() {
    	System.out.println("Hai");
    }
    int value() {
    	return 10;
     }
	static public  void main(String[] args) {
	     HelloWorld h =new HelloWorld();
	     System.out.println(h.a);  //protected variable
	     h.print(); //protected method
	}

}
