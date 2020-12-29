package eg1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateReadValidateDemo {

	public static void main(String[] args) {
		String s = "1.1.1";// dd.MM.yyyy
		if (s.matches("[0-9]{2}.[0-9]{2}.[0-9]{4}")) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			sdf.setLenient(false);
			Date dob = null;
			try {
				dob = sdf.parse(s); // takes String and returns date object
				System.out.println("dob validated with dob = " + dob);
			} catch (ParseException e) {
				System.out.println("invalid date");
			}
		} else {
			System.out.println("invalid date");
		}
	}

}
