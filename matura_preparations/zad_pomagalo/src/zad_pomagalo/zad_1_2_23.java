package zad_pomagalo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class zad_1_2_23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> N = 
				Arrays.stream(scan.nextLine().split(""))
				.map(Integer::parseInt)
				.toList();
		if(N.size() != 6) {
			return;		
		}
		long oddNumCount = N.stream().filter(n -> n % 2 == 1).count();
		int lastNumn = getLastThreeNumbres(N.get(0),N.get(2),N.get(4));
		System.out.println(constructPIN(oddNumCount, lastNumn));
	}

	private static int getLastThreeNumbres(int first,int second,int third) {
		String number = first+""+second+""+third;
		String reverseNumber = third+""+second+""+first;
		
		int a = Integer.parseInt(number);
		int b = Integer.parseInt(reverseNumber);
		
		return Math.abs(a - b);
		
	}
	
	private static String constructPIN(long firstNum,int lastThreeNums) {
		return String.format("%d%03d",firstNum,lastThreeNums);
	}
}
