package programmers_java;

public class hoclblra_2200801 {
	
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = (n < m) ? n : m;
        int gbs = 0;
        
        for (int i = 1; i <= min; i++) {
        	if (n % i == 0 && m % i == 0) {
        		gbs = i;
        	}
        }
		
		answer[0] = gbs;
		answer[1] = n * m / gbs;
		
		return answer;
    }
    
	public static void main(String[] args) {
	int n = 2;
	int m = 5;
	solution(n, m);
	
	}
}