package arrays_class_demo;

import java.util.Arrays;

public class ArrayUtilClassDemo {

	public static void main(String[] args) {
		int ar[] = {12,33,11,2,344,11,12,11,22,11,11,23,11,44,22,11};
		System.out.println("Contents of ar: ");
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(ar));
		
		int ar1[] = Arrays.copyOf(ar, ar.length+10);
		System.out.println("ar1 = " + Arrays.toString(ar1));
		
		int ar2[] = new int[10];
		Arrays.fill(ar2, 99999);
		System.out.println("ar2 = " + Arrays.toString(ar2));
		
		/*
		 * Binary Search - is a searching algorithm which goes by divide and conquer approach.
		 * Pre-requisite to perform Binary search the array should and must be in sorted order (ascending only)
		 * How does it start the search?
		 * 1) it starts the search from the mid position of array, if mid element is matching to the search element it will return true
		 * 2) lets say the mid element is greater than the search element so now it would do the search on the greater side of the mid element
		 * else it would do the search from smaller side of the mid element
		*/
		
		System.out.println(Arrays.binarySearch(ar, 100));
		System.out.println(Arrays.binarySearch(ar, 1000));
		System.out.println(Arrays.binarySearch(ar, 1));
		System.out.println(Arrays.binarySearch(ar, 11));

	}

}
