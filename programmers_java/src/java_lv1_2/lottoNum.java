package java_lv1_2;

import java.util.Arrays;

public class lottoNum {

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int zeroCnt = 0; // 0의 갯수
		int numCnt = 0; // 일치한 솟자 갯수

		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0)
				zeroCnt++;
		}

		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j])
					numCnt++;
			}
		}
		System.out.println(zeroCnt);
		System.out.println(numCnt);
		
		int minRank = rank(numCnt); // 최소 로또등수 
		int maxRank = rank(zeroCnt + numCnt); // 최대 로또 등수 

		answer[1] = minRank;
		answer[0] = maxRank;

		System.out.println(Arrays.toString(answer));
		
		return answer;
	}

	private static int rank(int cnt) {
		
		switch (cnt) {
		case 6 :
			return 1;
		case 5 :
			return 2;
		case 4 :
			return 3;
		case 3 :
			return 4;
		case 2 :
			return 5;
		default:
			return 6;
		}
	}

	public static void main(String[] args) {
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };
		solution(lottos, win_nums);
	}
}
