package custom_demo;

public class Validation {

public boolean isValidAge(int age) throws InvalidAgeException {
		
		if(age<=0) {
			throw new InvalidAgeException("Age cannot be zero or -ve");
		}
		
		if(age<18 || age >40) {
			throw new InvalidAgeException("Only users between age 18 and 40 are acceptable");
		}
		
		return true;
	}
	
	
	public boolean isValidMobileNumber(String mobileNumber) throws BusinessException {
	
		if(!mobileNumber.matches("\\+1-[0-9]{10}")) {
			throw new BusinessException("Entered Mobile Number "+mobileNumber+" is INVALID");
		}
		
		return true;
	}
}
