package collections;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
       HashSet<String> hs = new HashSet<String>();
		
		hs.add("Mahesh");
		hs.add("Suresh");
		hs.add("Ravi");
		hs.add("Vijay");
		hs.add("Mahesh");
		
		//iterate the collection using foreach loop
		for(String s:hs) {
			System.out.println(s);
		}

	}

}
