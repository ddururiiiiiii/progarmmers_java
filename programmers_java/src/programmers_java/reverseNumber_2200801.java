package programmers_java;

public class reverseNumber_2200801 {
	
    public static int[] solution(long n) {
    	
    	long num = n;
    	int count = 0;
    	
    	// 자릿수 알아오기
        while (num != 0) {
        	num /= 10;
        	count++;
        }
    	int[] answer = new int[count];
    	
        num = n;
        for(int i = 0; num != 0; i++){
            answer[i] = (int)(num % 10);
            num /= 10;
        }
       
        return answer;
    }
	
	public static void main(String[] args) {
	long n = 12345;
	solution(n);
	
	}
}