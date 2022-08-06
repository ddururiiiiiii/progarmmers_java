package programmers_java2;

public class centerWord {

    public static String solution(String s) {
        String answer = "";
        
        int num = s.length() / 2;
        
        if (s.length() % 2 != 0) {
        	answer = s.substring(num, num+1);
        } else {
        	answer = s.substring(num-1, num+1);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String s = "qwe";
		solution(s);
	}
}
