package zad_pomagalo_softuni;

import java.util.ArrayDeque;
import java.util.Scanner;

public class printer_queue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayDeque<String> que = new ArrayDeque<>();
		
		String input = scan.nextLine();
		while(!input.equals("print")){
			if(input.equals("cancel") && que.size() == 0) {
				System.out.println("Printer is on standby");
			}else if(input.equals("cancel")) {
				que.poll();
			}else {
				que.offer(input);
			}
			input = scan.nextLine();
		}
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}

}
