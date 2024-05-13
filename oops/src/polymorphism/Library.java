package polymorphism;

public class Library {

	public static void main(String[] args) {
		 Library obj =new  Library ();
		 Books_Strore obj1=new Books_Strore();
		 obj.books(400);
		 obj1.books();
		
		 

	}
    static String books(String name) {
    	 name="java";
    	 System.out.println(name);
		return name;
    	
    }
     int books(int price) {
    	 price =500;
    	 System.out.println(price);
		return price;
    	
    }
    void books() {
    	String author ="james Gosling";
    	System.out.println(author);
    }
	
}
class Books_Strore extends Library {
	 static String books(String name) {
    	 name="java";
    	 System.out.println(name);
		return name;
    	
    }
    public  int books(int price) {
    	 price =450;
    	 super.books(price);
    	// System.out.println(price);
		return price;
    	
    }
    void books() {
    	String author ="Latha1  ";
    	System.out.println(author);
    }
	
}
