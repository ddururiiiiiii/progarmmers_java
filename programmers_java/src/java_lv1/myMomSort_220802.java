package java_lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class myMomSort_220802 {
	
    public static String[] solution(String[] strings, int n) {
        
    	ArrayList<String> arrList = new ArrayList<String>();
        
        for (int i = 0; i < strings.length; i++) {
        	arrList.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(arrList);
        
        String[] answer = new String[arrList.size()];
        
        for (int i = 0; i < arrList.size(); i++) {
        	answer[i] = arrList.get(i).substring(1, arrList.get(i).length());
        }
        
        return answer;
    }	
    
	public static void main(String[] args) {

	String[] strings = {"sun", "bed", "car"};
	int n = 45;
	solution(strings, n);
	
	}
}