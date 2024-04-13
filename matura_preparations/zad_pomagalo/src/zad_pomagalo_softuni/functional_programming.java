package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.Scanner;

public class functional_programming {

	public static void main(String[] args) {
		Arrays.stream(new Scanner(System.in).nextLine().split("\\s+"))
		.forEach(el -> System.out.println("Sir " + el));
	}

}
