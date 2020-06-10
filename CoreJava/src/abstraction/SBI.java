package abstraction;
abstract class RBI{
	abstract void minBalance();
	static void welcome() {
		System.out.println("Welcome to E-Banking!");
	}
}
class ICICI extends RBI{
	void minBalance() {
		System.out.println("Minimum balance in ICICI account is 5000");
	}
}
public class SBI extends RBI{
	
	void minBalance() {
		System.out.println("Minimum balance in SBI account is 1000");
	}
	public static void main(String[] args) {
		  welcome();
		  
         RBI i = new ICICI();   //reference object...
         i.minBalance();
         
         
         RBI s = new SBI();    //reference object...
         s.minBalance();

	}

}
