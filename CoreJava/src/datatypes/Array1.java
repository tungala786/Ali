package datatypes;

public class Array1 {
    int a[]=new int[3];  //instance array
    /*{
    a[0]=12;
    a[1]=23;
    a[2]=34;
    }*/
	public static void main(String[] args) {
		Array1 obj = new Array1();
		
		/*obj.a[0]=12;
		obj.a[1]=23;
		obj.a[2]=34;*/
		
		System.out.println(obj.a[2]);   //prints 34
		System.out.println(obj.a.length); //prints 3
		System.out.println(obj.x);
	}
         int x=10; //instance variable
}
