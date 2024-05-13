package polymorphism;

 class First{
	public void eat() {
		System.out.println("first called");
		this.food();
	}
	public void food() {
		System.out.println("rice");
	}
}
  class Second extends First {
	  public void eat() {
		  System.out.println("Second called");
		  super.eat();
	  }
  }
 
public class Over_Load extends Second {

	public static void main(String[] args) {
	 
		Second sec =new Second();
		sec.eat();

	}

}
