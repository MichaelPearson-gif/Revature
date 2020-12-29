package eg_time_api_java8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeApiJava8Demo {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println("ld : "+ld);
		System.out.println(ld.isLeapYear());
		ld=ld.plusMonths(1);
		System.out.println("ld : "+ld);
		System.out.println(ld.isLeapYear());
		
		String s="16.02.1994";
		LocalDate dob=LocalDate.parse(s, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println("dob : "+dob);
		LocalDate now=LocalDate.now();
		System.out.println("now : "+now);
		
		Period p=Period.between(dob, now);
		System.out.println("You are "+p.getYears()+" year/s, "+p.getMonths()+" month/s and "+p.getDays()+" day/s old");

		System.out.println("You are " + ChronoUnit.DAYS.between(dob, now) + " days old");
		System.out.println("You are " + ChronoUnit.YEARS.between(dob, now) + " years old");
		System.out.println("You are " + ChronoUnit.MONTHS.between(dob, now) + " months old");
		
		String future = "16.02.2021";
		LocalDate birthday = LocalDate.parse(future, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println("You are " + ChronoUnit.DAYS.between(dob, birthday) + " days old");
		System.out.println("You are " + ChronoUnit.YEARS.between(dob, birthday) + " years old");
		System.out.println("You are " + ChronoUnit.MONTHS.between(dob, birthday) + " months old");
	}

}
//LocalTime
//LocalDateTime
