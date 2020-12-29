package loop_package;

public class palindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("dad"));
		System.out.println(isPalindrome("roller"));

	}

	public static boolean isPalindrome(String m) {
		boolean b = false;
		
		int i = 0;
		int j = m.length() - 1;
		
		while (i < j) {
			
			if (m.charAt(i) != m.charAt(j)) {
				return b;
			}
			i++;
			j--;
		}
		return true;
		
	}
}
