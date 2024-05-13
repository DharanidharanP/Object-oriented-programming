package EnumP;

  

public class Enum_Main {

	
	public static void main(String[] args) {
		Dayofweek day =Dayofweek.MONDAY;
		day.holidays();
		
		System.out.println(day);
		switch (day) {
		 case SUNDAY:
			String str="plan to trip";
			System.out.println(str);
			break;
		 case MONDAY:
			 if(day==Dayofweek.MONDAY)
			 System.out.println("work Start day");
		}

	}

}
