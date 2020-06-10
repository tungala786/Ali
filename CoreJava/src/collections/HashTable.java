package collections;
import java.util.*;
public class HashTable {

	public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(103, "Mahesh");
		ht.put(100, "Ravi");
		ht.put(101, "Ali");
		ht.put(102, "Harry");
		ht.put(100, "Vijay");
		ht.put(100, "Rizvi");
		
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
