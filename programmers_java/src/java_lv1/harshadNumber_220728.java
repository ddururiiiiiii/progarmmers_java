package java_lv1;

public class harshadNumber_220728 {
	
    public static boolean solution(int x) {
    	
        boolean answer = false;
        int sum = 0;
        int num = x;
        
        while(x != 0) {
        	sum += x % 10;
        	x /= 10;
        }

        if(num % sum == 0) {
        	answer = true;
        }
        
        System.out.println(answer);
        return answer;
    }
    
	
	public static void main(String[] args) {
	int x = 13;
	
	solution(x);
	
	}
}