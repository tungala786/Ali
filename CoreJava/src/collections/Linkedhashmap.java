package collections;
import java.util.*;
public class Linkedhashmap {

	public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		
		lhm.put(103, "Mahesh");
		lhm.put(100, "Ravi");
		lhm.put(101, "Ali");
		lhm.put(102, "Harry");
		lhm.put(100, "Vijay");
		lhm.put(100, "Rizvi");
		
		for(Map.Entry m:lhm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
