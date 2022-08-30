package java_lv1_3;

public class evenOdd {
	
    public static String solution(int num) {
        String answer = "";
        
        if (num % 2 == 0) answer = "Even";
        else answer = "Odd";
        
        return answer;
    }
    
    public static void main(String[] args) {
		
    	int num = 3;
    	solution(num);
	}
}
