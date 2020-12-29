package array;

public class ElementDeletion {

	public static void main(String[] args) {
		// Delete specific element from an array
		
		// Initial array
		int ar[] = {1,2,3,4,5,6,7,8,9,10};
				
		// number that will help keep i within the index range of the array
		int n = 9;
		// index number of the element above our deletion point
		int delpos = 6;
		
		// Loop through the array
		for (int i = delpos - 1; i < n; i++) {
			ar[i] = ar[i + 1];
		}
		// Decriment n
		n--;
		
		// Printing out the array after deletion
		System.out.println("Printing contents of ar after deletion");
		for (int i = 0; i <= n; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
