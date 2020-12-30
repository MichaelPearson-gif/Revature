package eg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = Arrays.asList(12, 233, 33, 11, 22, 33, 11, 33, 22, 45, 66, 77);
		
		List<Integer> liEven = new ArrayList<>();
		for (Integer i:li) {
			if (i % 2 == 0) {
				liEven.add(i);
			}
		}
		System.out.println("Actual list li: " + li);
		System.out.println("Even list liEven: " + liEven);
		
		List<Integer> liEvenStream = li.stream().filter(i -> (i % 2 ==0)).collect(Collectors.toList());
		System.out.println("Even List Streams: " + liEvenStream);
		
		List<Integer> liEvenSortedDistinctStream = li.stream().filter(i -> (i % 2 ==0)).distinct().sorted().collect(Collectors.toList());
		System.out.println("Even Distinct Sorted List Streams: " + liEvenSortedDistinctStream);
	}

}
