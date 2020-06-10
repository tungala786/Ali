package constructors;

public class Student {
    int rollno;
    String name;
    String city;
    
    Student(){   //default constructor
    	
    }
    Student(int r,String n){   //parameterized constructor
    	rollno=r;
    	name=n;
    }
    Student(int r,String n,String c){  //overloaded constructor
    	rollno=r;
    	name=n;
    	city=c;
    }
    void print() {
    	System.out.println(rollno+" "+name+" "+city);
    }
    
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(2222,"Ali");
		Student s3=new Student(3333,"Mahesh","Hyderabad");
		
		s1.print();
		s2.print();
		s3.print();

	}

}
