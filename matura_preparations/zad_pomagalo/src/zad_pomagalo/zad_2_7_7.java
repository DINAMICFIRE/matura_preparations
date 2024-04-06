package zad_pomagalo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zad_2_7_7 {

	public static void main(String[] args) {
		String sentence = 
				new Scanner(System.in)
				.nextLine()
				.replace(",", "")
				.replace(";", "")
				.replace(".", "")
				.replace("?", "")
				.replace("!", "")
				.toLowerCase();
		
		Map<String, Integer> count = new HashMap<>();
		for (String word : sentence.split("\\s+")) {
			if(count.containsKey(word)) {
				int oldCount = count.get(word);
				count.put(word, oldCount + 1);
			}else {
				count.put(word,1);
			}
		}
		for (Map.Entry<String, Integer> entry : count.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.printf("%s:%d; ",key,val);
		}
		
	}

}
