package EnumP;
	 enum Dayofweek{
		   SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY;
			   private Dayofweek() {   
			  System.out.println("constructor called");
			  
			  }
			 
		 public void holidays() {
			 System.out.println("Saturday Sunday ");
		 }
	   }

