package zad_pomagalo_softuni;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for (Integer integer : input) {
			stack.push(integer);
		}
		
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
