package programmers_java;

public class numToNumPlus_2200801 {
	
    public static long solution(int a, int b) {
        long answer = 0;
        
        if (a > b) {
            for (int i = b; i < a+1; i++) {
            	answer += i;
            }       	
        } else {
        	for (int i = a; i < b+1; i++) {
        		answer += i;
        	}
        }
        	
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
	int a = 3;
	int b = 5;
	solution(a, b);
	
	}
}