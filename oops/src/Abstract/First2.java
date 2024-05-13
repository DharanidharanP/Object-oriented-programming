package Abstract;

public class First2 extends First1{
	
	public void Food() {
		System.out.println("what food Do you Want?");
	}
	

	public static void main(String[] args) {
		First1 f1=new First2();
		f1.Food();
		f1.rice();
	}

}
