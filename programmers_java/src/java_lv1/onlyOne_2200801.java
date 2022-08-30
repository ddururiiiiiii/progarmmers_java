package java_lv1;

public class onlyOne_2200801 {
	
    public static int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i < n; i++) {
        	if (n % i == 1) {
        		answer = i;
        		break;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
	int n = 10;
	solution(n);
	
	}
}