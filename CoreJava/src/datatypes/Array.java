package datatypes;

public class Array {

	public static void main(String[] args) {
		int a[]=new int[3];
		
		a[0]=11;
		a[1]=23;
		a[2]=34;
		
		System.out.println(a[2]); //prints 34
		
		System.out.println(a.length);  //prints 3
		
		//Alternative way to declare an array
		int b[]= {1,2,3,4,5};
		
		//print 5
		System.out.println(b[4]);
		System.out.println(b.length);
		
		

	}

}
