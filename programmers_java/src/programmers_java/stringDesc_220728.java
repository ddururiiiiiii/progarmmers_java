package programmers_java;

import java.util.Arrays;

public class stringDesc_220728 {
	
    public static String solution(String s) {
    	String answer = "";
    	
    	// char 배열 만들어 담아주기
    	char[] string = s.toCharArray();
        
    	//오름차순으로 정렬
    	Arrays.sort(string);
    	
    	// 내림차순으로 정렬
    	for (int i = string.length-1; i >= 0; i--) {
    		answer += string[i];
        }
        System.out.println(answer);
        return answer;
    }
	
    
	public static void main(String[] args) {
	String s = "Zbcdefg";
	solution(s);
	
	}
}