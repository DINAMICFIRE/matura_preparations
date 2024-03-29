package zad_pomagalo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class zad_2_4_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		List<PairValue> pairs = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split("\\s+");
			int firstNum = Integer.parseInt(input[0]);
			int secondNum = Integer.parseInt(input[1]);
			
			
			pairs.add(new PairValue(firstNum, secondNum));
			
		}
		pairs.sort((el1 , el2) -> el1.compareTo(el2));
		pairs.forEach(System.out::println);
	}

	public static class PairValue implements Comparable<PairValue> {

		private int firstNum;
		private int secondNum;

		public PairValue(int firstNum, int secondNum) {
			this.firstNum = firstNum;
			this.secondNum = secondNum;
		}
		

		public int getFirstNum() {
			return firstNum;
		}


		public int getSecondNum() {
			return secondNum;
		}


		

		@Override
		public String toString() {
			return firstNum + " " + secondNum;
		}


		@Override
		public int compareTo(PairValue o) {
			int result = Integer.compare(firstNum, o.getFirstNum());
			if(result == 0) {
				result = Integer.compare(secondNum, o.getSecondNum());
			}
			return result;
		}
	}

}
