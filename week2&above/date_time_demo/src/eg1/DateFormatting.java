package eg1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println("default date object : "+d);
		/*
		 *  dd - date in 2 digits 
		 *  MM - month in 2 digits   MMM - short name of month    MMMM - full month name
		 *  yy - last 2 digits of year    yyyy - year in full
		 *  EEE - day in shortname,  EEEE full day name
		 *  mm - minutes
		 *  ss - seconds
		 *  HH - 24hour
		 *  hh - 12hour
		 *  z/Z - time zone
		 *  a - am/pm
		 *  
		 */
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("EEEE MM-dd-yyyy   hh:mm:ss a z Z");
		System.out.println("formatted date : "+sdf.format(d)); //format takes date and gives formatted date as String

	}

}
