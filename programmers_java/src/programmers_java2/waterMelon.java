package programmers_java2;

public class waterMelon {

    public static String solution(int n) {
        String answer = "";
        
        for (int i = 1; i <= n; i++) {
        	if (i % 2 == 1) {
        		answer += "수";
        	} else {
        		answer += "박";
        	}
        }
        
        return answer;
    }

    public static void main(String[] args) {
		int n = 3;
		solution(n);
	}
}
