package java_lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class hateSameNumber_2200801 {
	
    public static int[] solution(int []arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != num){
                arrList.add(arr[i]);
                num = arr[i];
            }
        }
        
        int[] answer =  new int[arrList.size()];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = arrList.get(i);
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    
	public static void main(String[] args) {
	int[] n = {1,1,3,3,0,1,1};
	solution(n);
	
	}
}