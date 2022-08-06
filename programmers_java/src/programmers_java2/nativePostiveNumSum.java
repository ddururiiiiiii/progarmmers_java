package programmers_java2;

import java.util.Arrays;

public class nativePostiveNumSum {

    public static int[] solution(int[] array, int[][] commands) {
        
    	// 결과 값에 담을 수
    	int[] answer = new int[commands.length];
        
       for (int i = 0; i < commands.length; i++) {
    	   int a = commands[i][0];
    	   int b = commands[i][1];
    	   int c = commands[i][2];
    	
    	   int[] temp = Arrays.copyOfRange(array, a-1, b);
    	   Arrays.sort(temp);
    	   answer[i] = temp[c-1];
       }
        
        return answer;
    }

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		solution(array, commands);
	}
}
