package java_lv1_2;

public class numBetweenNum {

    public static long solution(int a, int b) {
        long answer = 0;
        
        if (a < b) 
        	for (int i = a; i <= b; i++)
        		answer += i;
    	else if (a > b)
        	for (int i = b; i <= a; i++)
        		answer += i;
    	else if (a == b)
    		answer = a;
        
        return answer;
    }
    
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		solution(a, b);
	}
}
