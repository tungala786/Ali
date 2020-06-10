package oops;

public class Student {
	    int rollno;
	    String name;
	    String city;
	    
	    Student(){   //default constructor
	    	System.out.println("default constructor!");	    	
	    }
	    Student(int rollno,String name){   //parameterized constructor
	    	this();  //creates the default object 
	    	this.rollno=rollno;
	    	this.name=name;
	    }
	    Student(int rollno,String name,String city){  //overloaded constructor
	    	this.rollno=rollno;
	    	this.name=name;
	    	this.city=city;
	    }
	    void print() {
	    	System.out.println(rollno+" "+name+" "+city);
	    }
	public static void main(String[] args) {
		//Student s1=new Student();
		Student s2=new Student(1111,"Mahesh");
		Student s3=new Student(2222,"Ali","NY");
		
		//s1.print();
		s2.print();
		s3.print();

	}

}
