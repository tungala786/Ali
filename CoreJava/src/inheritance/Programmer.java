package inheritance;
class Employee{
	double sal=10000;   //attribute
	double hike() {     //method
		return(sal*0.40);
	}
}
public class Programmer extends Employee {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.speed);
		c.start();
	}

}
