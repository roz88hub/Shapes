import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

//Calender method

public class LearnDate {
	
 public static void main(String[] args) {
	 
	 // Today's date and time will be current time 
	Date ddate = new Date();
	System.out.println(ddate.getHours());
	//Milliseconds since midnight Jan 1st, 1970;
	System.out.println(ddate.getTime());
	//Format to Hour and Minutes
	DateFormat format = new SimpleDateFormat("HH:MM");
	System.out.println(format.format(ddate));

	//Get current date time
	SimpleDateFormat calDay = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
	Calendar calendar = new GregorianCalendar(2013,0,31); //imported java.util.GregorianCalendar;
	System.out.println(calDay.format(calendar.getTime()));
 
	//set a date manually
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
	Calendar calendarGeorge = new GregorianCalendar(2013,1,28,13,24,56);	
	System.out.println("#1. " + sdf.format(calendarGeorge.getTime()));

	calendarGeorge.set(Calendar.YEAR, 2018);
	calendarGeorge.set(Calendar.MONTH, 9);
	calendarGeorge.set(Calendar.HOUR, 20);
	calendarGeorge.set(Calendar.MINUTE, 60);
		
	System.out.println("#2. " + sdf.format(calendarGeorge.getTime()));
 }
}
