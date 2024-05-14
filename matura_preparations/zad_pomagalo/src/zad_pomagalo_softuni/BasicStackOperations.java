package zad_pomagalo_softuni;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BasicStackOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\s+");
		int numbersInStack = Integer.parseInt(input[0]);
		int numbersToPop = Integer.parseInt(input[1]);
		int numberToFindOut = Integer.parseInt(input[0]);
		
		int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		int smallerstNum = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbersInStack - numbersToPop; i++) {
			if(numberToFindOut == arr[i]) {
				System.out.println("true");
				return;
			}
			if(smallerstNum > arr[i]) {
				smallerstNum = arr[i];
			}
			
		}
		System.out.println(smallerstNum);
		
	}

}
