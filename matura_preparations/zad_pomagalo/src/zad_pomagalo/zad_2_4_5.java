package zad_pomagalo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class zad_2_4_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer,Integer> numbers = new TreeMap<>();
	
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(scan.nextLine());
			addElementToMap(numbers, num);
		}
		
		
		n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(scan.nextLine());
			addElementToMap(numbers, num);
		}
		
		
		
		printRepeatedElements(numbers);

	}
	private static void addElementToMap(Map<Integer,Integer> numbers,int num) {
		if(numbers.containsKey(num)) {
			int oldCount = numbers.get(num);
			numbers.put(num, oldCount + 1);
		}else {
			numbers.put(num,1);
		}
	}
	private static void printRepeatedElements(Map<Integer,Integer> numbers) {
		for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
			
		}
	}

}
