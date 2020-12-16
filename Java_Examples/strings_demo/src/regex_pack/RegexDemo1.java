package regex_pack;

public class RegexDemo1 {

	public static void main(String[] args) {
		/*
		 * Reg-Ex - Regular Expression
		 * Short hand of writing an expression using some wild cards, which would match the pattern and give the results
		 * [] - to write an expression
		 * {} - represents length
		 * ^ - not
		 * [0-9]{5} - any digits of length 5
		 * [a-zA-Z]{6} - any word of length 6 characters
		 * [a-zA-Z0-9]{2,6} - any alphanumeric of minimum length 2 and max length 6
		 * [A-Z]{1} - minimum 1 uppercase letter and max can be any
		 * [^a-z] - apart from lowercase letters, anything else is accepted
		 */
		
		String s = "GH J123s a34 *()--9d lkKjk 1 P";
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(s.replaceAll("[^a-z]", ""));
		System.out.println(s.replaceAll("[a-zA-Z0-9]", ""));
		
		String ex = "ABIDE1234O";
		// First 5 uppercase letters followed by 4 digits and an uppercase letter
		if (ex.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Validated");
		}
		else {
			System.out.println("Failed");
		}
			

	}

}
