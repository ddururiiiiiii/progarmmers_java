package programmers_java;

import java.util.ArrayList;
import java.util.Arrays;

public class myMom_220802 {
	
	 public static int[] solution(int[] numbers) {
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
        	for (int j = i+1; j < numbers.length; j++) {
        		int sum = numbers[i] + numbers[j];
        		if (arrList.indexOf(i) < 0) {
        			arrList.add(sum);
        		}
        	}
        }
        
        int[] answer = new int[arrList.size()];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = arrList.get(i);
        } 
        Arrays.sort(answer)
        ;
        return answer;
	 }
	 
	public static void main(String[] args) {
	int[] numbers = {2,1,3,4,1};
	solution(numbers);
	
	}
}