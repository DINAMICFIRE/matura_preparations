package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public class filter_by_age {

	public static void main(String[] args) {
		// TODO implement the zad
		// Write a program that reads an integer N on the first line. And on next N
		// lines read pairs of "{name}, {age}". Then read three more lines:
		// • Condition - "younger" or "older"
		// • Age - Integer
		// • Format - "name", "age" or "name age"
		// Depending on the condition, print the pairs in the right format.
		// Don't use any built-in functionality. Write your methods.

		// input
		// 5
		// Peter, 20
		// George, 18
		// Maria, 29
		// Idan, 31
		// Simeon, 16
		// older
		// 20
		// name age

		// output
		// Peter - 20
		// Maria - 29
		// Idan - 31

		Scanner scan = new Scanner(System.in);
		Map<String, Integer> people = new LinkedHashMap<>();
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			String[] info = scan.nextLine().split(", ");
			people.put(info[0], Integer.parseInt(info[1]));
		}
		String type = scan.nextLine();
		int age = Integer.parseInt(scan.nextLine());
		String format = scan.nextLine();

		for (Map.Entry<String, Integer> entry : people.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();

			if(type.equals("older") && val < age) {
				people.remove(key);
			}else if(type.equals("younger") && val > age) {
				people.remove(key);
			}
		}
		if(format.equals("age")) {
			for (Map.Entry<String, Integer> entry : people.entrySet()) {
				Integer val = entry.getValue();
				System.out.println(val);
			}
		}else if(format.equals("name")) {
			for (Map.Entry<String, Integer> entry : people.entrySet()) {
				String key = entry.getKey();
				System.out.println(key);
			}
		}else {
			for (Map.Entry<String, Integer> entry : people.entrySet()) {
				String key = entry.getKey();
				Integer val = entry.getValue();
				System.out.println(key + " " + val);
			}
		}
		//one loop and if in it but i too lazy to do it now

	}

}
