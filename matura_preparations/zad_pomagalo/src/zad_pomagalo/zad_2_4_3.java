package zad_pomagalo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad_2_4_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		List<Triple> pairs = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split("\\s+");
			int firstNum = Integer.parseInt(input[0]);
			int secondNum = Integer.parseInt(input[1]);
			int thirdNum = Integer.parseInt(input[2]);

			pairs.add(new Triple(firstNum, secondNum, thirdNum));

		}
		pairs.sort((el1, el2) -> el1.compareTo(el2));
		pairs.forEach(System.out::println);
	}

	public static class Triple implements Comparable<Triple> {

		private int firstNum;
		private int secondNum;
		private int thirdNum;

		public Triple(int firstNum, int secondNum, int thirdNum) {
			this.firstNum = firstNum;
			this.secondNum = secondNum;
			this.thirdNum = thirdNum;
		}

		public int getFirstNum() {
			return firstNum;
		}

		public int getSecondNum() {
			return secondNum;
		}

		public int getThirdNum() {
			return thirdNum;
		}

		@Override
		public String toString() {
			return firstNum + " " + secondNum + " " + thirdNum;
		}

		@Override
		public int compareTo(Triple o) {
			int result = Integer.compare(firstNum, o.getFirstNum());
			if (result == 0) {
				result = Integer.compare(secondNum, o.getSecondNum());
				if (result == 0) {
					result = Integer.compare(thirdNum, o.getThirdNum());
				}
			}
			return result;
		}
	}

}
