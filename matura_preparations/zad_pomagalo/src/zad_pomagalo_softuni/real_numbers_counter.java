package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class real_numbers_counter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Double,Integer> count = new LinkedHashMap<>();
		
		Arrays.stream(scan.nextLine().split("\\s+"))
		.map(Double::parseDouble)
		.forEach(el -> {
			if(count.containsKey(el)) {
				count.put(el, count.get(el) + 1);
			}else {
				count.put(el, 1);
			}
		});
		for (Map.Entry<Double, Integer> entry : count.entrySet()) {
			Double key = entry.getKey();
			Integer val = entry.getValue();
			System.out.printf("%.1f -> %d%n",key,val);
		}
	}

}
