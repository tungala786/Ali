package statics;
public class Student {
    int rollno;
    String name;
    static String college="IIT";
    
    Student(int rollno,String name){
    	this.rollno=rollno;
    	this.name=name;
    	
    }
    void print() {
    	System.out.println(rollno+" "+name+" "+college);
    }
    static void change() {
    	college="VIT";
    }
    static {
    	System.out.println("Welcome to Freshers!");
    }
	public static void main(String[] args) {
	   
       Student s1= new Student(1111,"Mahesh");
       Student s2= new Student(2222,"Raj");
       Student s3= new Student(3333,"Ali");
       
       s1.print();
       s2.print();
       s3.print();
       
       System.out.println("*********************");
       change();   //college will be changed to VIT
       
       s1.print();
       s2.print();
       s3.print();
	}
	static {
		System.out.println("Ragging is prohibited!");
	}

}
