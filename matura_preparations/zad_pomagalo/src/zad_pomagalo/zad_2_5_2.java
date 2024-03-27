package zad_pomagalo;

import java.util.Arrays;
import java.util.Scanner;

public class zad_2_5_2 {
public static void main(String[] args) {
	Arrays.stream(new Scanner(System.in).nextLine().split("\\s+")).map(word -> {
		String newWord = word .charAt(0)+"";
		char lastChar = word.charAt(0);
		for (int i = 1; i < word.length(); i++) {
			if(word.charAt(i) != lastChar) {
				newWord += word.charAt(i)+"";
			}
			lastChar = word.charAt(i);
		}
		return newWord;
		
	}).forEach(word -> System.out.print(word + " "));
	
	


}
}
