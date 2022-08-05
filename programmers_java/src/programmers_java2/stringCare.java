package programmers_java2;

import java.util.Arrays;

public class stringCare {

    public static String solution(String s) {
        String answer = "";
        
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        for (int i = charArr.length-1; i >= 0; i--) {
        	answer += charArr[i];
        }
        return answer;
    }

	public static void main(String[] args) {
		String s = "Zbcdefg";
		solution(s);
	}
}
