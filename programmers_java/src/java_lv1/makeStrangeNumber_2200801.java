package java_lv1;

import java.util.Arrays;

public class makeStrangeNumber_2200801 {
	
    public static String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
        	
        	if(arr[i].equals(" ")) {
        		index = 0;
        	} else if(index % 2 == 0) {
        		arr[i] = arr[i].toUpperCase();
                index++;
            } else if(index % 2 != 0) {
            	arr[i] = arr[i].toLowerCase();
                index++;
            }
            answer += arr[i];
        } 
        return answer;
    }
	
	public static void main(String[] args) {
	String s = "try hello world";
	solution(s);
	
	}
}