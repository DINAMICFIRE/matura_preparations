package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class periodic_table {

	public static void main(String[] args) {
		Arrays.stream(new Scanner(System.in).nextLine().split("\\s+"))
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		//its unsorted 
	}

}
