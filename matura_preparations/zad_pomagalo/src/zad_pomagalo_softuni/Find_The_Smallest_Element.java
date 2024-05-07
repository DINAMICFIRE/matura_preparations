package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Find_The_Smallest_Element {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+"))
				.map(el -> Integer.parseInt(el))
				.collect(Collectors.toList());
		int index = -1;
		int smallestNum = Integer.MAX_VALUE;
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) < smallestNum) {
				smallestNum = list.get(i);
				index = i;
			}
		}
		System.out.println(index);
		
	}

}
