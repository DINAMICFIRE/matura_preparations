package zad_pomagalo;

import java.util.Arrays;
import java.util.Scanner;

public class zad_2_5_3 {
public static void main(String[] args) {
	Arrays.stream(
			new Scanner(System.in).nextLine().split("\\s+"))
	.map(word -> word.length())
	.sorted((el1, el2) -> el2.compareTo(el1))
	.limit(1)
	.forEach(el ->System.out.println(el));
}
}
