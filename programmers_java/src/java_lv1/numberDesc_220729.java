package java_lv1;

import java.util.Arrays;

public class numberDesc_220729 {
	
    public static long solution(long n) {
    	
    	// long 숫자 -> 문자 
    	String str = String.valueOf(n);
    	
    	// 문자 -> char 배열
    	char[] s = str.toCharArray();
    	
    	// char 배열 - 오름차순  
        Arrays.sort(s);
        
        // char배열 -> 역순 -> 문자
        String temp = new StringBuilder(new String(s)).reverse().toString();
        System.out.println("내림차순 : " + temp);
        
        // 문자 -> long타입 숫
        return Long.parseLong(temp);
    }
	
	public static void main(String[] args) {
	long n = 118372;
	solution(n);
	
	}
}