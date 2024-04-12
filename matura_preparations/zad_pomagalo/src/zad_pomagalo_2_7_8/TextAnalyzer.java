package zad_pomagalo_2_7_8;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAnalyzer {

	private String text;

	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void inputText(String name){
		try {
		Scanner scan = new Scanner(new File(name));
		while(scan.hasNext()) {
			text += scan.nextLine();
			text += " ";
		}
		text.trim();
		
		}catch (Exception e) {
			System.out.println("File not found!");
		}
	}

	public void wordFrequencer() {
		String sentence = 
				this.text
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
