package Inheritance;

public class Sube_class extends Super_class {
        
	public void eat() {
		System.out.println("well come to Hotel");
		super.eat();
	}
	
	public void food() {
		String verity="chicken rice";
		System.out.println(verity);
		
	}
	public void Sube_class (int i) {
		System.out.println("Sube_class  called");
		
	}
	
	public static void main(String[] args) {
		
		Super_class sup=new Super_class();
		sup.eat();
		Sube_class sub=new Sube_class();
		sub.eat();
        sub. price(250);
	
	}

}
