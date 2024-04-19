package other_mathematical_expressions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		ArrayDeque<String> operators = new ArrayDeque<>();
		ArrayDeque<String> expression = new ArrayDeque<>();
		Map<String, Integer> priorites = new HashMap<>();
		priorites.put("*", 3);
		priorites.put("/", 3);
		priorites.put("+", 2);
		priorites.put("-", 2);
		priorites.put("(", 1);

		for (String anInput : input) {
			try {
				double num = Double.parseDouble(anInput);
				expression.addLast(anInput);
			} catch (Exception e) {
				switch (anInput) {
				case "(":
					operators.push(anInput);
					break;
				case ")":
					String symbol = operators.pop();
					while (!symbol.equals("(")) {
						expression.addLast(symbol);
						symbol = operators.pop();
					}
					break;
				default:
					while (!operators.isEmpty() && priorites.get(operators.peek()) >= priorites.get(anInput)) {
						expression.addLast(operators.pop());
					}
					operators.push(anInput);
					break;
				}
			}
		}
		while (!operators.isEmpty()) {
			expression.addLast(operators.pop());
		}
		
		List<String> list = new ArrayList<>(expression);
		
		while (list.size() > 1) {
			Double n1 = Double.parseDouble(list.remove(0));
			Double n2 = Double.parseDouble(list.remove(0));
			String opperand = list.remove(0);
			
			if(opperand.equals("*")) {
				list.add(0,(n1 * n2) + "");
			}else if(opperand.equals("+")) {
				list.add(0,(n1 + n2) + "");
			}else if(opperand.equals("-")) {
				list.add(0,(n1 - n2) + "");
			}else if(opperand.equals("/")) {
				list.add(0,(n1 / n2) + "");
			}
		}
		System.out.println("Result of the expression is "  + list.get(0));
//TODO works sometimes
	}
}
