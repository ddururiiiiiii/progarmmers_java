package java_lv1;

import java.util.Stack;

public class pickDolls_220804 {

	public static int solution(int[][] board, int[] moves) {

		// 인형이 제거된 횟
		int answer = 0;

		// 인형을 담는stack.
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					if (!stack.empty() && stack.peek() == board[j][moves[i] - 1]) {
						answer++;
						stack.pop();
						board[j][moves[i] - 1] = 0;
						break;
					} else {
						stack.push(board[j][moves[i] - 1]);
						board[j][moves[i] - 1] = 0;
						break;
					}
				}
			}
		}
		return answer * 2;
	}

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] move = { 1, 5, 3, 5, 1, 2, 1, 4 };
		solution(board, move);

	}
}