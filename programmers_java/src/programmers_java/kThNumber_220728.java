package programmers_java;

import java.util.Arrays;

public class kThNumber_220728 {
	
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        //[i, j, k]
        //배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
        for(int i = 0; i < commands.length; i++) {
        	int a = commands[i][0];
        	int b = commands[i][1];
        	int c = commands[i][2];
        	
        	int[] temp = Arrays.copyOfRange(array, a-1, b);
        	Arrays.sort(temp);
        	answer[i] = temp[c-1];
        	
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	
    
	public static void main(String[] args) {
	int[] array = {1, 5, 2, 6, 3, 7, 4};
	int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
	solution(array, commands);
	
	}
}