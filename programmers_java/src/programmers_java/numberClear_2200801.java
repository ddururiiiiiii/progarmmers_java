package programmers_java;

import java.util.Arrays;

public class numberClear_2200801 {
	
    public static int[] solution(int[] arr, int divisor) {
        
        int arrCnt = 0;
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] % divisor == 0) {
        		arrCnt++;
        	}
        }
        
        int[] answer = new int[arrCnt];
        arrCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                answer[arrCnt]=arr[i];
                arrCnt++;
            }
       }
       Arrays.sort(answer);
       
      if(answer.length == 0) {
    	  answer = new int[1];
    	  answer[0] = -1;
      }
       
       System.out.println(Arrays.toString(answer));
        return answer;
    }
	
	public static void main(String[] args) {
	int[] arr = {5, 9, 7, 10};
	int dvisor = 5;
	solution(arr, dvisor);
	
	}
}