package Abstract;


 abstract class College{
	  void nameOfCollege() {
		  System.out.println("Ganamani college of technology");
	  }
	   abstract void degree() ;
	   void result() {
		  System.out.println("base on student");
	  }
}

class Student extends College{
	void degree() {
		System.out.println("EEE");
	}
}
public class Life {
	public static void main(String[] args) {
		College  obj =new  Student();
          obj.degree();
          
	}

}
