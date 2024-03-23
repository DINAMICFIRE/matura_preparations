package zad_pomagalo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class zad_1_2_35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<String> number = Arrays.stream(scan.nextLine().split(""))
				.collect(Collectors.toList());
		
		if(number.size() > 21) {
			System.out.println("Number too long");
		}
		
		String ordered = String.join("", number);
		Collections.reverse(number);
		String reversed = String.join("",number);
		
		if(ordered.equals(reversed)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
