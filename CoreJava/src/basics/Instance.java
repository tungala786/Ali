package basics;

public class Instance {
    int x = 10;  //instance variable
    void print() {   //instance method
    	System.out.println(x*2);
    }
	public static void main(String[] args) {
		
		Instance obj = new Instance();  //object creation
		System.out.println(obj.x);  //accessing the instance variable
		obj.print();

	}

}
