package programmers_java;

import java.util.Arrays;

public class xJumpNnumber_220728 {
	
    public static long[] solution(int x, int n) {
	    long[] answer = new long[n];
	    
	    for (int i = 0; i < n; i++) {
	    	answer[i] =(long)x * (i + 1);
    	}
	    
	    System.out.println(Arrays.toString(answer));
	    return answer;
    }
	
	public static void main(String[] args) {
	int x = -4;
	int n = 2;
	
	solution(x, n);
	
	}
}