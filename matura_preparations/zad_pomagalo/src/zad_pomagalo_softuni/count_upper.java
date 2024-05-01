package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class count_upper {
public static void main(String[] args) {
	List <String> words = 
			Arrays.stream(new Scanner(System.in).nextLine().split("\\s+"))
			.filter(el -> el.charAt(0) > 64 && el.charAt(0) < 91)
			.collect(Collectors.toList());
		System.out.println("There are " + words.size() + " upper case letters!");
		System.out.println("And they are:");
		System.out.println(String.join(System.lineSeparator(), words));
}
}
