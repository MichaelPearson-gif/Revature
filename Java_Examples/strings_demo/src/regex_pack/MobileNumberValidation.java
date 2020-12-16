package regex_pack;

public class MobileNumberValidation {

	public static void main(String[] args) {
		
		String s = "+1-234567890";
		if (s.matches("\\+1-[0-9]{10}")) {
			System.out.println("Valid Mobile Number");
		}
		else {
			System.out.println("Invalid Mobile Number");
		}

	}

}
// task1 - write a program to validate an SSN number using regex
// task2 - write a program to validate DL (drivers license)
