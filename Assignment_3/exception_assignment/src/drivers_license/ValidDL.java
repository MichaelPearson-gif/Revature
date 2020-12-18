package drivers_license;

public class ValidDL {

	public void main(String[] args) {
		
		String s = "c7862345";
		
		try {
			String j = s.getChars(1, 7);
			int test = j.parseInt();
		}
		
		
	}
	
	// Best possible solution to the problem
	public static boolean isValid(String s) {
		
		if (s.matches("[A-Z][0-9]{7}")) {
			return true;
		}
		
		return false;
		
//		for (int i = 0; i < s.length()-1; i++) {
//			
//		}
	}
}
