package programmers_java;

public class centerString_220728 {
	
    public static String solution(String s) {
        String answer = "";
        int centerNum = s.length() / 2;
        
        if (s.length() % 2 == 0) {
        	answer = s.substring(centerNum-1, centerNum+1);
//        	System.out.println(answer);
        } else {
        	answer = s.substring(centerNum, centerNum+1);
//        	System.out.println(answer);
        }
//        System.out.println(answer);
        
        return answer;
    }
    
	
	public static void main(String[] args) {
	String s = "abcdc";
	
	solution(s);
	
	}
}