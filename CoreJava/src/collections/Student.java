package collections;
import java.util.*;
public class Student {
    int rollno;
    String name;
    Student(int rollno,String name){
    	this.rollno=rollno;
    	this.name=name;
    }
	public static void main(String[] args) {
		Student s1=new Student(1111,"Mahesh");
		Student s2=new Student(2222,"Rajesh");
		
		//create a collection of Students
        ArrayList<Student> al = new ArrayList<Student>();
        
        //put all the objects into the collection
        al.add(s1);
        al.add(s2);
        
        //iterate the collection using the Iterator interface
        Iterator itr= al.iterator();
        
        while(itr.hasNext()) {  //checks if there are anymore objects in the arraylist
        	Student s=(Student) itr.next();   //captures all the student objects into the object s
        	System.out.println(s.rollno+" "+s.name);
        }
	}

}
