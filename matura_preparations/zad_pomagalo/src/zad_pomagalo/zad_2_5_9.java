package zad_pomagalo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class zad_2_5_9 {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		
		List<String> list = Arrays.stream(input.split("")).collect(Collectors.toList());
		Collections.reverse(list);
		
		String reversed = String.join("", list);
		 
		if(input.equals(reversed)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
