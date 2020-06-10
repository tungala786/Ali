package collections;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Mahesh");
		al.add("Suresh");
		al.add("Ravi");
		al.add("Vijay");
		al.add("Mahesh");
		
		//fetch the specific element vijay
		System.out.println(al.get(3));
		
		System.out.println("********************");
		//iterate the collection using foreach loop
		for(String s:al) {
			System.out.println(s);
		}
		System.out.println("*********************");
		//using the iterator interface
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
