package polymorphism;

public class Restarunt {
        
	static void  food(String rice,String water) {
		System.out.println(rice+" "+water);
	}
	void food(String rice) {
		rice ="egg rice ";
		System.out.println(rice);
	}
	void food(int  price) {
		int discount=100;
		price=discount;
		System.out.println(price);
	}
	public static void main(String[] args) {
		 Restarunt obj=new  Restarunt();
		 obj.food(120);
		 food("chickenrice","hot");
      
	}

}
