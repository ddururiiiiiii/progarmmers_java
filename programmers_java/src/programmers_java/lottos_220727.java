package programmers_java;

import java.util.Arrays;

public class lottos_220727 {
	
    public static int[] solution(int[] lottos, int[] win_nums) {
    	int[] answer = {};
    	answer = new int[2];
    	
    	int zeroCnt = 0;
    	int winCnt = 0;
    	
    	for (int i = 0; i < lottos.length; i++) {
    		// 0의 갯수 세기
    		if (lottos[i] == 0) {
    			zeroCnt++;
    			continue;
    		}
    		// 일치하는 숫자 세기
    		for (int j = 0; j < lottos.length; j++) {
    			if (lottos[i] == win_nums[j]) {
    				winCnt++;
    				break;
    			}
    		}
    	}
    	
    	int minCnt = winCnt;
    	int MaxCnt = winCnt + zeroCnt;
    	answer[1] = rank(minCnt);
    	answer[0] = rank(MaxCnt);
    	
    	System.out.println(Arrays.toString(answer));
    	return answer;
    }
    
    public static int rank(int cnt) {
    	
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
    	default :
    		return 6;
    	}
    }
	
	public static void main(String[] args) {
	
	int[] lottos = {44, 1, 0, 0, 31, 25};
	int[] win_nums = {31, 10, 45, 1, 6, 19};
	solution(lottos, win_nums);
	
	}
}