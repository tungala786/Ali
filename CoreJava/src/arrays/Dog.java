package arrays;

public class Dog {
   String name;
   Dog(String name){
	   this.name=name;
   }
   void bark() {
	   System.out.println(name+" says wow!");
   }
	public static void main(String[] args) {
		    Dog d1=new Dog("Scooby"),
				d2=new Dog("Whoophy"),
				d3=new Dog("Rambo");
		
		//create an array of Dogs
          Dog d[]=new Dog[3];
          d[0]=d1;
          d[1]=d2;
          d[2]=d3;
          
          //tell all the dogs to bark
          for(int i=0;i<d.length;i++) {
        	  d[i].bark();
          }

	}

}
