package EnumPackage;
enum Day{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class EnumTest3 {
	
	Day day;
	
	public EnumTest3(Day day){
	this.day=day;	
	}
	
	public void daysMethod(){
		
		switch(day){
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			System.out.println("Monday to Friday are working days");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Saturday and Sunday are weekend");
			break;
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "TUESDAY";
       EnumTest3 t = new EnumTest3(Day.valueOf(str));
       t.daysMethod();
       
	}

}
