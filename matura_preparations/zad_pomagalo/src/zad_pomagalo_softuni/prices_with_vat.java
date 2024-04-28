package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.Scanner;

public class prices_with_vat {
public static void main(String[] args) {
	Arrays.stream(new Scanner(System.in).nextLine().split(","))
	.map(Double::parseDouble)
	.map(el -> el + (el * 0.2))
.forEach(el -> System.out.printf("%.2f %n",el));
	
}
}
