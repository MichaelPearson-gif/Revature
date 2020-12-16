package chardemo;

public class CharacterWrapperDemo {

	public static void main(String[] args) {
		
		String s = "GH J123s a34 *()--9d lkKjk 1 P";
		int alphas = 0, upper = 0, lower = 0, digit = 0, alphanum = 0, space = 0, special = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				alphas++;
			}
			if (Character.isUpperCase(c)) {
				upper++;
			}
			if (Character.isLowerCase(c)) {
				lower++;
			}
			if (Character.isDigit(c)) {
				digit++;
			}
			if (Character.isLetterOrDigit(c)) {
				alphanum++;
			}
			if (Character.isWhitespace(c)) {
				space++;
			}
			if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
		}
		System.out.println("Total alphabet count: " + alphas);
		System.out.println("Total ucase count: " + upper);
		System.out.println("Total lcase count: " + lower);
		System.out.println("Total digit count: " + digit);
		System.out.println("Total alphanumeric count: " + alphanum);
		System.out.println("Total spaces count: " + space);
		System.out.println("Total special count: " + special);

	}

}
