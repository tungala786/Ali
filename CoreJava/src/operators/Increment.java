package operators;  

public class Increment {

	public static void main(String[] args) {
		int x=10;
		
		System.out.println(x++);  //prints 10
		System.out.println(x);    //prints 11
		
		System.out.println(++x);  //prints 12
		
		System.out.println(x++ + ++x + x);  //prints 40
		             
		System.out.println(x);  //prints 14
                           
	}

}
