package zad_pomagalo_2_6_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("src/zad_pomagalo_2_6_2/birthPlace"));
			Map<String,Integer> count = new HashMap<>();
			while(scan.hasNext()) {
				String input = scan.nextLine();
				String city = input.split(" - ")[1];
				if(count.containsKey(city)) {
					int newCount = count.get(city) + 1;
					count.put(city, newCount);
				}else {
					count.put(city, 1);
				}
			}
			
			String city = "";
			int countStudents = 0;
			for (Map.Entry<String, Integer> entry : count.entrySet()) {
				Integer val = entry.getValue();
				if(val > countStudents) {
					countStudents = val;
					city = entry.getKey();
				}
			}
			System.out.println(city + " -> " + countStudents);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
