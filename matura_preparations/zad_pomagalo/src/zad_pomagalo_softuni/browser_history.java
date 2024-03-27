package zad_pomagalo_softuni;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class browser_history {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayDeque<String> stack = new ArrayDeque<>();
		
		
		String input = scan.nextLine();
		while(!input.equals("Home")) {
			input = scan.nextLine();
			if(input.equals("back")) {
				if(stack.size() <= 1) {
					System.out.println("no previous URLs");
					input = scan.nextLine();
					continue;
				}else {
					stack.pop();
				}
			}else {
				stack.push(input);
			}

			
			System.out.println(stack.peek());
			input = scan.nextLine();
			
			
		}

	}
}
