package zad_pomagalo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad_1_2_32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(scan.nextLine());
			list.add(m);
		}
		
		int min = findMin(list);
		int max = findMax(list);
		
		if(min == 0 || max == 0 || min == max) {
			System.out.println("0 0");
		}else {
			System.out.println(min + " " + max);
		}
	}
	private static int findMin(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if(i+1 == list.get(i)) {
				return list.get(i);
			}
		}
		return 0;
	}
	private static int findMax(List<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			if(i+1 == list.get(i)) {
				return list.get(i);
			}
		}
		return 0;
	}

}
