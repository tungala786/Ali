package collections;
import java.util.*;
public class Linkedhashset {

	public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Mahesh");
		lhs.add("Suresh");
		lhs.add("Ravi");
		lhs.add("Vijay");
		lhs.add("Mahesh");
		
		//iterate the collection using foreach loop
		for(String s:lhs) {
			System.out.println(s);
		}

	}

}
