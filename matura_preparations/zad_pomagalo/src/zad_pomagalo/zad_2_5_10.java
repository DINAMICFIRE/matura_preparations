package zad_pomagalo;

import java.util.Arrays;
import java.util.Scanner;

public class zad_2_5_10 {

	public static void main(String[] args) {
		Arrays.stream(new Scanner(System.in).nextLine().split("\\s+")).map(el -> {
			if (el.contains("<upper>")) {
				return el.substring(7, el.length() - 8).toUpperCase();
				
			}
			return el;

		}).forEach(el -> System.out.print(el +" "));
	}
}
