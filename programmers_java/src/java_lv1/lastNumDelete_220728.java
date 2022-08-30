package java_lv1;

import java.util.Arrays;

public class lastNumDelete_220728 {
	
    public static int[] solution(int[] arr) {
        
        // 배열길이 1인경우
       if (arr.length == 1) {
    	   int[] answer = {-1};
    	   return answer;
       }
       
   	   int[] answer = new int[arr.length-1];
   	   
   	   // 제일 작은 값 구하기
   	   int min = arr[0];
   	   
	   for (int i = 1; i < arr.length;  i++) {
        	min = Math.min(min, arr[i]);
        }
	   
	   int index = 0;
	   
	   for (int i = 0; i < arr.length;  i++) {
		   if (arr[i] == min) {
			   continue;
		   }
		   answer[index++] = arr[i];
	   }
	   
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    
	
	public static void main(String[] args) {
	int[] arr = {4,3,2,1};
	solution(arr);
	
	}
}