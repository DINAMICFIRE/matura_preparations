package zad_pomagalo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class zad_2_5_5 {
	private static int[][] matrix;
	private static int[][] check;
	private static int currentCount;

	public static void main(String[] args) {
		matrix = new int[4][4];
		check = new int[4][4];
		currentCount = 0;
		fillMatrix();
		int maxCount = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				solve(i, j);
				if (currentCount > maxCount) {
					maxCount = currentCount;
				}
				currentCount = 0;
			}
		}
		System.out.println(maxCount / 2);

	}

	private static void fillMatrix() {
		Scanner scan = new Scanner(System.in);
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            matrix[i][j] = scan.nextInt();
	        }
	    }
	}

	private static void solve(int x, int y) {
		// solve up
		if (x - 1 >= 0) {
			if (matrix[x][y] == matrix[x - 1][y] && check[x - 1][y] == 0) {
				currentCount++;
				check[x - 1][y] = 1;
				solve(x - 1, y);
				check[x - 1][y] = 0;
			}
		}
		// solve down
		if (x + 1 < 4) {
			if (matrix[x][y] == matrix[x + 1][y] && check[x + 1][y] == 0) {
				currentCount++;
				check[x + 1][y] = 1;
				solve(x + 1, y);
				check[x + 1][y] = 0;
			}
		}
		// solve left
		if (y - 1 >= 0) {
			if (matrix[x][y] == matrix[x][y - 1] && check[x][y - 1] == 0) {
				currentCount++;
				check[x][y - 1] = 1;
				solve(x, y - 1);
				check[x][y - 1] = 0;
			}
		}
		// solve right
		if (y + 1 < 4) {
			if (matrix[x][y] == matrix[x][y + 1] && check[x][y + 1] == 0) {
				currentCount++;
				check[x][y + 1] = 1;
				solve(x, y + 1);
				check[x][y + 1] = 0;
			}
		}
	}

}
