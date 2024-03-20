package zad_pomagalo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class one_two_thirty {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+"))
				.map(Integer::parseInt)
				.sorted()
				.collect(Collectors.toList());
		if(list.size() < 3) {
			return;
		}
		System.out.print(list.get(0) + " ");		
		System.out.println(list.get(1));	
	
	
	
	}

}
