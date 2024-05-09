package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class min_number_in_collection {

	public static void main(String[] args) {	
		Collections.min(Arrays.stream(new Scanner(System.in).nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList()));	
	}
}
