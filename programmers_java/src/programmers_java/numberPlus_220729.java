package programmers_java;

public class numberPlus_220729 {
	
    public static long solution(int n) {
            int answer = 0;
            
            while(n > 0){
                answer += n%10;
                n/=10;
            }
            return answer;
        }
	
	public static void main(String[] args) {
	int n = 118372;
	solution(n);
	
	}
}