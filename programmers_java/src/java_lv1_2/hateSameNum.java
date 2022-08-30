package java_lv1_2;

import java.util.ArrayList;

public class hateSameNum {

    public static int[] solution(int []arr) {
        int num = -1;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i  = 0; i < arr.length; i++) {
        	if (arr[i] != num) {
        		list.add(arr[i]);
        		num = arr[i]; 
        	}
        }
        
        int[] answer =  new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }

    public static void main(String[] args) {
		int[] n = {1,1,3,3,0,1,1};
		solution(n);
	}
}
