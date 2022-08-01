package programmers_java;

import java.util.Arrays;

public class yNumberCntSum_220801 {
	
    public static int solution(int left, int right) {
        int answer = 0;
        
        int[] arr = new int[(right-left)+1];
        System.out.println();
        
        int num = left;
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = num + i;
        }
        System.out.println(Arrays.toString(arr));
        
        
        for (int i =0; i < arr.length; i++) {
        	
        	int count =0;
            for (int a = 1; a<= arr[i]; a++) {
            	if(arr[i] % a == 0) {
            		count++;
            	}
            }
            if (count % 2 ==0) {
            	answer += arr[i];
            } else {
            	answer -= arr[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
    
	public static void main(String[] args) {
	int left = 13;
	int right = 17;
	solution(left, right);
	
	}
}