package Interface;

interface Animal{
	public void eat();
	public void sleep();
	public void  makeSound();
	
}
  interface   Cat{
	  void eat();
	  void sleep();
	 void colour();
  }
  
  class Dog implements Animal,Cat{

	public void eat() {
		System.out.println("curd rice ");
		
	}
	public void sleep() {
		int hours=6;
		System.out.println("Sleeping hours "+hours);
	}

	
	public void makeSound() {
		
		String dog="bww bbww";
		String cat="MEYAW MEYAW";
		if("MEYAW MEYAW"==cat) {
			System.out.println(dog);
		}
		else
		System.out.println(cat);
		
	}
	public void colour() {
		String colour="white";
		System.out.println(colour.replaceFirst(colour, "black"));
		
	}
	   
   }
public class Main {
	public static void main(String[] args) {
		
       Dog obj =new Dog();
       obj.eat();
       obj.makeSound();
       obj.colour();
	}

}
