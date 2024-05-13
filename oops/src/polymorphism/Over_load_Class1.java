package polymorphism;

public class Over_load_Class1 {
      public void name1(String name)  {
    	  name="Dharanbarbie";
    	  System.out.println(name);
      }
      public void name1() {
    	  System.out.println("Dharan");
      }
      public static void main(String[] args) {
    	  Over_load_Class1 obj=new Over_load_Class1();
    	  obj.name1("you");
    	  obj.name1();
	}
}
