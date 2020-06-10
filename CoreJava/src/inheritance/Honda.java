package inheritance;
class Car{
	int speed=100;
	 void start() {
		System.out.println("Car started!");
	}
}
class Benz extends Car{
	int speed = 120;
	 void start() {
		System.out.println("Benz started with speed " +super.speed);
	}
}
public class Honda extends Car{
	void start() {
		System.out.println("Honda started!");
	}
	public static void main(String[] args) {
		Benz b = new Benz();
		Honda h = new Honda();
		
		b.start();
		h.start();
		
		//final int s=100;
		//s=s*2;
        Car c = new Car();  //class
        System.out.println(c.speed);  //variable
        c.start(); //method
	}

}
