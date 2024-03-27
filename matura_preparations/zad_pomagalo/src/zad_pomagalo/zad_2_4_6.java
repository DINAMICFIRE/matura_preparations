package zad_pomagalo;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class zad_2_4_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Random rnd = new Random();
		Set <Integer> numbers = new TreeSet();
		while(numbers.size() != 6){ {
			int randomInt = rnd.nextInt(1,50);
			numbers.add(randomInt);
		}
		}
		numbers.forEach(el -> System.out.print(el + " "));
		
	}
}
