package java_lv1;

public class hagissla_220729 {
	
    public static String solution(int n) {
        String answer = "";
        
        for (int i = 0; i < n; i++) {
        	
        	if (i % 2 == 0) {
        		answer += "수";
        		
        	} else {
        		answer += "박";
        	}
        }
       System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
	int n = 3;
	solution(n);
	
	}
}