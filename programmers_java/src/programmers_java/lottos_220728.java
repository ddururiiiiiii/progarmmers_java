package programmers_java;

import java.util.Arrays;

public class lottos_220728 {
	
    public static int[] solution(int[] lottos, int[] win_nums) {
    	int[] answer = new int[2];
    	
    	int winNumCnt = 0;
    	int zeroCnt = 0;
    	for (int i  = 0; i < lottos.length; i++) {
    		if (lottos[i] == 0) {
    			zeroCnt++;
    			continue;
    		}

    		for (int j = 0; j < win_nums.length; j++) {
    			if (lottos[i] == win_nums[j]) {
    				winNumCnt++;
    				break;
    			}
    		}
    	}
    	
    	answer[0] = rank(winNumCnt + zeroCnt);
    	answer[1] = rank(winNumCnt);
    	
    	System.out.println(Arrays.toString(answer));
    	return answer;
    }
    
    
    public static int rank(int cnt) {
    	
    	switch(cnt) {
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