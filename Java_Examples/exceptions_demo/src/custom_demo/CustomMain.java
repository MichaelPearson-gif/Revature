package custom_demo;

public class CustomMain {

	public static void main(String[] args) {
		
		Validation v=new Validation();
		try {
			if(v.isValidAge(21)) {
				System.out.println("Age Validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(v.isValidMobileNumber("+1-9123456780")) {
			System.out.println("Mobile Number Validated");
		}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}

	}

}

// Create a Custom Check exception if the entered DL is valid or not
// Create a Custom Unchecked exception for checking if the entered Passport number is valid or not
