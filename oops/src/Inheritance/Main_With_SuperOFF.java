package Inheritance;

class Animal {
	Animal(){
		System.out.println("i am Animal");
	}
	Animal(String type){
		System.out.println("TYpe "+type);
	}
}


 class Dog extends Animal{
	  Dog(){
		  super();
		  System.out.println("i am a dog");
	  }
 }
    public  class Main_With_SuperOFF extends Dog{
	   
	   public static void main(String[] args) {
			Dog dog1=new Dog();
		}

  }
 
