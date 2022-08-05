package programmers_java2;

import java.util.Arrays;

public class leastNum {

	public static int[] solution(int[] arr) {

		if (arr.length == 1) {
			int[] answer = { -1 };
			return answer;
		}

		int[] answer = new int[arr.length - 1];

		// 제일 작은 수 구하기
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min == arr[i]) {
			 continue;
			}
			answer[index++] = arr[i];
			
		}

		System.out.println(Arrays.toString(answer));

		return answer;
	}

	public static void main(String[] args) {
		int[] s = { 4, 3, 2, 1 };
		solution(s);
	}
}
