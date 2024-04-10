package zad_pomagalo;

public class zad_2_3_4 {
	private static String[][] board;
	private static int count;
	public static void main(String[] args) {
		board = new String[5][5];
		count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				horseMoveDownLeft(i, j);
				horseMoveDownRight(i, j);
				horseMoveLeftDown(i, j);
				horseMoveLeftUp(i, j);
				horseMoveRightDown(i, j);
				horseMoveRightUp(i, j);
				horseMoveUpLeft(i, j);
				horseMoveUpRight(i, j);
			}
		}
		System.out.println(count);
		//TODO: exercise is unclear
	}

	public static void horseMoveUpLeft(int indexA, int indexB) {
		try {
			board[indexA - 2][indexB - 1] = "X";
			count++;
		} catch (IndexOutOfBoundsException e) {
			
		}
	}
	public static void horseMoveUpRight(int indexA, int indexB) {
		try {
			board[indexA - 2][indexB + 1] = "X";
			count++;
		} catch (IndexOutOfBoundsException e) {
			
		}
	}
	public static void horseMoveDownLeft(int indexA, int indexB) {
		try {
			board[indexA + 2][indexB - 1] = "X";
			count++;
		} catch (IndexOutOfBoundsException e) {
			
		}
	}
	public static void horseMoveDownRight(int indexA, int indexB) {
		try {
			board[indexA + 2][indexB + 1] = "X";
			count++;
		} catch (IndexOutOfBoundsException e) {
			
		}
	}
	public static void horseMoveLeftUp(int indexA, int indexB) {
		try {
			board[indexA - 1][indexB - 2] = "X";
			count++;
		} catch (IndexOutOfBoundsException e) {
			
		}
	}
	public static void horseMoveLeftDown(int indexA, int indexB) {
		try {
			board[indexA + 1][indexB - 2] = "X";
			count++;
		} catch (IndexOutOfBoundsException e) {
			
		}
	}
	public static void horseMoveRightUp(int indexA, int indexB) {
		try {
			board[indexA - 1][indexB + 2] = "X";
			count++;
		} catch (IndexOutOfBoundsException e) {
			
		}
	}
	public static void horseMoveRightDown(int indexA, int indexB) {
		try {
			board[indexA + 1][indexB + 2] = "X";
			count++;
		} catch (IndexOutOfBoundsException e) {
			
		}
	}
}
