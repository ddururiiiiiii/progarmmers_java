package java_lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class samJin_220802 {
	
	public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arrList = new ArrayList<>();
        
        while(n != 0) {
        	arrList.add(n % 3);
            n /= 3;
        } 
        
        int temp = 1;
        for(int i = arrList.size() - 1; i >= 0;i--) {
            answer += arrList.get(i) * temp;
            temp *= 3;
        }
        return answer;
    }
	
	public static void main(String[] args) {
	int n = 45;
	solution(n);
	
	}
}