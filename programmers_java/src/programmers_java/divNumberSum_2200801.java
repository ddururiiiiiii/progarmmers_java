package programmers_java;

public class divNumberSum_2200801 {
	
    public static int solution(int n) {
        int answer = 0;
        
        int num = n;
        for (int a = 1; a<= num; a++) {
        	if(num % a == 0) {
        		answer += a;
        	}
        }
        return answer;
    }
    
	public static void main(String[] args) {
	int n = 12;
	solution(n);
	
	}
}