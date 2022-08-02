package programmers_java;

public class findingSosoo_220801 {
	
    public static int solution(int n) {
        int answer = 0;
        
        // 1과 자기 자신으로만 나눠짐 
        
        int count = 0;
        for (int i  = 2; i <= n; i++){
        	if (i % 1 == 0 && i % i == 0) {
        		count++;
        		System.out.println(count);
        	}
        }
        System.out.println(count);
        
        return answer;
    }
    
	public static void main(String[] args) {
	int n = 10;
	solution(n);
	
	}
}