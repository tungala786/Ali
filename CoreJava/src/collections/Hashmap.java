package collections;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(103, "Mahesh");
		hm.put(100, "Ravi");
		hm.put(101, "Ali");
		hm.put(102, "Harry");
		hm.put(100, "Vijay");
		hm.put(100, "Rizvi");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
