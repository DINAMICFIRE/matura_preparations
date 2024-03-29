package zad_pomagalo;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class zad_2_4_1 {
public static void main(String[] args) {
	
	List<Integer> numbers = 
			Arrays.stream(new Scanner(System.in).nextLine().split("\\s+"))
			.map(Integer::parseInt)
			.sorted().collect(Collectors.toList());
	
	int smallestDiff = Integer.MAX_VALUE;
	for (int i = 0; i < numbers.size() - 1; i++) {
		int currentNum = numbers.get(i);
		int nextNum = numbers.get(i + 1);
		
		int diff = Math.abs(currentNum - nextNum);
		if( diff < smallestDiff) {
			smallestDiff = diff;
		}
	}
	System.out.println(smallestDiff);
}
}
