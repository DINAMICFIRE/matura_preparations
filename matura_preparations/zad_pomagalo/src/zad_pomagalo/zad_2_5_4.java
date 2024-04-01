package zad_pomagalo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class zad_2_5_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(el -> Integer.parseInt(el))
				.collect(Collectors.toList());

		if (numbers.size() < 3) {
			return;
		}
		int countUp = 0;
		int countDown = 0;

		for (int i = 0; i < numbers.size(); i++) {
			int before;
			int current = numbers.get(i);
			int next;
			if (i == 0) {
				before = numbers.get(numbers.size() - 1);
				next = numbers.get(i + 1);
			} else if (i == numbers.size() - 1) {
				before = numbers.get(i - 1);
				next = numbers.get(0);
			} else {
				before = numbers.get(i - 1);
				next = numbers.get(i + 1);
			}

			if (current > before && current > next) {
				countUp++;
			} else if (current < before && current < next) {
				countDown++;
			}
		}
		System.out.println(countUp + " " + countDown);

	}

}
