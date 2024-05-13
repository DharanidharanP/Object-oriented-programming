
package polymorphism;
public class Car1 {

	public static void main(String[] args) {
		Bike1 obj =new Bike1();
		obj.oilChange(500);
		obj.tyreType("MRF");
		obj.colour("white");
	}
	void oilChange(int price) {
		price =501;
		System.out.println(price);
	}
	
	void tyreType(String tyre) {
		System.out.println(tyre);
	}
	void colour(String colour) {
		colour="red";
		System.out.println(colour);
	}

}
 
class Bike1 extends Car1{
	void oilChange(int price) {
		
		System.out.println(price);
		
	}
	void tyreType(String tyre) {
		System.out.println(tyre);
	}
	void colour(String colour) {
		colour ="black";
		colour ="Yellow";
		System.out.println(colour);
	}
}