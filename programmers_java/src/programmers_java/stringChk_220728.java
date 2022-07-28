package programmers_java;

import java.util.Arrays;

public class stringChk_220728 {
	
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int dCnt = 0;
        // 정렬하기 
        Arrays.sort(d);
        System.out.println("정렬함: " + Arrays.toString(d));
        
       for (int i = 0; i < d.length; i++) {
    	   answer += d[i];
    	   if (answer <= budget) {
    		   dCnt++;
    	   }    	   
       }
        answer = dCnt;
        System.out.println("지원한 업체수 : " + answer);
        
        return answer;
    }
    
	
	public static void main(String[] args) {
	
	int[] d = {1,3,2,5,4};
	int budget = 8;
	solution(d, budget);
	
	}
}