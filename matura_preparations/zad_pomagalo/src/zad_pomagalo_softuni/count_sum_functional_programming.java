package zad_pomagalo_softuni;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class count_sum_functional_programming {

	public static void main(String[] args) {
		IntStream stream = Stream.of(new Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt);
		
		System.out.println("Count is" + stream.count());
		System.out.println("Sum is " + stream.sum());

	}

}
