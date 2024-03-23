package zad_pomagalo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class zad_1_2_26 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	
	int a = Integer.parseInt(scan.nextLine());
	int b = Integer.parseInt(scan.nextLine());
	int c = Integer.parseInt(scan.nextLine());
	
	List<Integer> list = new ArrayList<>(List.of(a,b,c));
	Collections.sort(list);
	Collections.reverse(list);
	list.forEach(el -> System.out.print(el+ " "));
}
}
