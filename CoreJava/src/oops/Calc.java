package oops;
public class Calc {
	int add(int a,int b){
	    return(a+b);
	}
	double add(double a,double b){
	    return(a+b);
	}
	int add(int a,int b,int c){
	    return(a+b);
	}
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.a);  //protected variable
		obj.print();  //protected method

	}

}
