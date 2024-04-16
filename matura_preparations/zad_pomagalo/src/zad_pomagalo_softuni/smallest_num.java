package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.Scanner;

public class smallest_num {

	public static void main(String[] args) {
		Arrays.stream(new Scanner(System.in).nextLine().split("\\s+"))
		.map(Integer::parseInt)
		.sorted()
		.limit(1)
		.forEach(el -> System.out.println(el));
		
	}

}
