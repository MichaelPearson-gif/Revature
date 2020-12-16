package eg2;

public class Demo2 {

	public static void main(String[] args) {
		int ar[] = {12,33,11,2,344,11,12};
		boolean b = false;
		int searchElement = 2;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == searchElement) {
				b = true;
				break;
			}
		}
		if(b) {
			System.out.println(searchElement + " found");
		}
		else {
			System.out.println(searchElement + " not found");
		}
		
		b = false;
		int newSearchElement = 12;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == searchElement) {
				b = true;
				System.out.println(newSearchElement + " found at position " + (i+1));
//				break;
			}
		}
		if(!b) {
			System.out.println(newSearchElement + " not found");
		}

	}

}
