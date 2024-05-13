package polymorphism;

public class poly_load {
     void dog(int a,int b) {
    	 
		System.out.println("total dogs"+a+b);
     }
     void dog (String  a,String b) {
    	 System.out.println(a+b);
     }
     public static void main(String[] args) {
    	 poly_load obj =new poly_load();
    	 obj.dog(1,2);
    	 obj.dog("puppy ","juley");
    	 
	}
}
   
	


