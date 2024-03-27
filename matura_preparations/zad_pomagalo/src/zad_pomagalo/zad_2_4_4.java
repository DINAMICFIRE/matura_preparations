package zad_pomagalo;

import java.util.Arrays;
import java.util.Scanner;

public class zad_2_4_4 {
	public static void main(String[] args) {
		Arrays
		.stream(new Scanner(System.in).nextLine().split("\\s+"))
		.map(Integer::parseInt)
		.sorted()
		.forEach(el -> System.out.print(el + " "));
	}
}
