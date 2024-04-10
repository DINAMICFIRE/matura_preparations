package zad_pomagalo;

public class zad_2_4_12 {
	private static int[][] board;
	private static final int SIZE = 4;
	private static final int EMPTY = 0;
	private static int count = 0;
// guess how i did it
	public static void main(String[] args) {
		board = new int[4][4];

		solve();
		System.out.println(count);
	}

	private static boolean solve() {
		int row = -1;
		int col = -1;
		boolean isEmpty = true;

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (board[i][j] == EMPTY) {
					row = i;
					col = j;

					isEmpty = false;
					break;
				}
			}
			if (!isEmpty) {
				break;
			}
		}

		if (isEmpty) {
			return true;
		}

		for (int num = 1; num <= SIZE; num++) {
			if (isValid(board, row, col, num)) {
				board[row][col] = num;

				if (solve()) {
					count++;
				}

				board[row][col] = EMPTY;
			}
		}
		return false;
	}

	private static boolean isValid(int[][] board, int row, int col, int num) {

		for (int i = 0; i < SIZE; i++) {
			if (board[row][i] == num || board[i][col] == num) {
				return false;
			}
		}

		int subGridRowStart = row - row % 2;
		int subGridColStart = col - col % 2;
		for (int i = subGridRowStart; i < subGridRowStart + 2; i++) {
			for (int j = subGridColStart; j < subGridColStart + 2; j++) {
				if (board[i][j] == num) {
					return false;
				}
			}
		}

		return true;
	}
}
