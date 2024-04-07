package zad_pomagalo;

import java.util.ArrayDeque;
import java.util.Scanner;

public class zad_2_7_1 {

	public static void main(String[] args) {
		String[] parentacies = new Scanner(System.in).nextLine().split("");
		ArrayDeque<String> stack = new ArrayDeque<>();
		int counter  = 0;
		
		for (String parentacy : parentacies) {
			if(stack.size() == 0) {
				stack.push(parentacy);
			}else {
				String oldParentacy = stack.peek();
				if(oldParentacy.equals("(") && parentacy.equals(")")) {
					stack.pop();
					counter++;
					
				}else {
					stack.push(parentacy);
				}
			}
		}
		if(stack.size() == 0) {
			System.out.println(counter);
		}else {
			System.out.println("Invalid");
		}

	}

}
