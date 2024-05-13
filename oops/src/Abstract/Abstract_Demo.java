package Abstract;

abstract  class Member {
	protected abstract void display();
	 private void salary() {
	   System.out.println("salary statisfied");
	    }
	
 }
 class Servent extends  Member {
	
	protected void display() {
		System.out.println("it showed "); 
		
	}
	 
 }

public class Abstract_Demo {

	public static void main(String[] args) {
		Servent obj =new Servent();
		obj.display();
		
	}

}

