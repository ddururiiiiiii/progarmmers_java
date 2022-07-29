package programmers_java;

public class hJ_220729 {
	
    public static String solution(int num) {
        String answer = "";
        
        if (num % 2 == 0)
        	answer = "Even";
        else 
        	answer = "Odd";
        
        System.out.println(answer);
        return answer;
    }
    
	
	public static void main(String[] args) {
	int num = 2;
	solution(num);
	
	}
}