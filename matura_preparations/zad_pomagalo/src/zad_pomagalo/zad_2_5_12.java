package zad_pomagalo;

import java.util.Scanner;

public class zad_2_5_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String outPut = "";
		
		while(scan.hasNext()) {
			String input = scan.nextLine();
			if(!input.contains("<") && input.contains(">")) {
				outPut += input;
			}
		}
		System.out.println(outPut);
	}

}
