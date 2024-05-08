package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_of_predicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+"))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		for (int i = 1; i <= n; i++) {
			boolean divisible = true;
			
			for (Integer integer : list) {
				if(i % integer != 0) {
					divisible = false;
				}
			}
			if(divisible) {
				System.out.println(i);
			}
		}
	}

}
