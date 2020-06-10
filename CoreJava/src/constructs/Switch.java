package constructs;

public class Switch {

	public static void main(String[] args) {
		int marks = 40;
        
        switch(marks){

       case 40 : System.out.println("Pass");
                 break;
       case 50 : System.out.println("Second class");
                 break;
       case 60 : System.out.println("First class");
                 break;
      default  : System.out.println("Failed");

           }

	}

}
