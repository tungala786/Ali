package strings;

public class String2 {

	public static void main(String[] args) {
		String s="sachin";
		String s1="tendulkar";
		
		System.out.println(s+s1);

		System.out.println(s.concat(s1));
		
		System.out.println(10+10);
		System.out.println("10"+"10");
		
		System.out.println(s+10);  //sachin10
		System.out.println(10+s);  //10sachin
		
		System.out.println(10+10+s);  //20sachin
		System.out.println(s+10+10);  //sachin1010
		System.out.println(s+(10+10));  //sachin20
		
	}

}
