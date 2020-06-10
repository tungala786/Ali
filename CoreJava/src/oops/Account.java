package oops;

public class Account {
    String name;
    public double bal=10000;
      
    public void balEnquiry() {
    	System.out.println("The current avaliable balance in " +name+"'s account is " + bal);
    }
    void withdraw(double amount) {
    	bal = bal-amount;
    	System.out.println("The amount " +amount + " withdrawn successfully");
    }
    void deposit(double amount) {
    	bal=bal+amount;
    	System.out.println("the amount "+amount +" deposited successfully");
    }
	public static void main(String[] args) {
		Account a = new Account();
		a.name="Ali";
		
		a.withdraw(2000);
		a.balEnquiry();
		System.out.println("********************************************");
		a.deposit(5000);
		a.balEnquiry();
      
	}

}
