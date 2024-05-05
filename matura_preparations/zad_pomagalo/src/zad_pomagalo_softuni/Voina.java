package zad_pomagalo_softuni;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Voina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Set<Integer> firstPlayer = new LinkedHashSet<>();
        Set<Integer> secondPlayer = new LinkedHashSet<>();
        int[] input = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < input.length; i++) {
            firstPlayer.add(input[i]);
        }
        input = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < input.length; i++) {
            secondPlayer.add(input[i]);
        }
        int steps = 0;
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            if (steps >= 50){
                break;
            }
            Integer firstNum = firstPlayer.iterator().next();
            Integer secondNum = secondPlayer.iterator().next();
            firstPlayer.remove(firstNum);
            secondPlayer.remove(secondNum);
            if (firstNum >= secondNum){
                
                firstPlayer.add(firstNum);
                firstPlayer.add(secondNum);

            }else{
                secondPlayer.add(firstNum);
                secondPlayer.add(secondNum);

            }
            steps++;
        }
        if (firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");
        }else if (firstPlayer.size() < secondPlayer.size()){
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw!");
        }

	}

}
