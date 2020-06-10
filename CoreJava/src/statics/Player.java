package statics;

public class Player {
    String name;
    static int playerCount=0;
   
    Player(String name){
    	this.name=name;
    	System.out.println("Player "+name+" added to the team!");
    	playerCount++;
    }
	public static void main(String[] args) {
		Player one = new Player("Usain Bolt");
		System.out.println("The player count is " +playerCount);
		
		Player two = new Player("Mike Jordan");
		System.out.println("The player count is " +playerCount);
	}

}
