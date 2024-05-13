package polymorphism;

public class Car {

	public static void main(String[] args) {
		Bike obj =new Bike();
		obj.oilChange(500);
		obj.tyreType("MRF");
		obj.colour("white");
	}
	void oilChange( int price) {
		price =200;
		System.out.println(price);
	}
	
	void tyreType(String tyre) {
		tyre="CEAT";
		System.out.println(tyre);
	}
	void colour(String colour) {
		colour="red";
		System.out.println(colour);
	}

}
 
class Bike extends Car{
       void oilChange(int price) {
		
		System.out.println(price);
		
	}
	void tyreType(String tyre) {
		super.tyreType(tyre);
		//System.out.println(tyre);
	}
	void colour(String colour) {
		colour ="black";
		System.out.println(colour);
	}
}
 




