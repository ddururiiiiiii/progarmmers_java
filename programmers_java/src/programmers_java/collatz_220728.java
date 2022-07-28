package programmers_java;

public class collatz_220728 {
	
    public static int solution(int num) {
        int answer = 0;
        
        while(num != 1){
            if(num % 2 == 0) {
                num = num / 2;
            }else if(num % 2 == 1){
                num = num * 3 + 1;
            }
            answer++;
           if(answer == 500) {
                answer = -1;
                break;
            }
        }
        
        //System.out.println(answer);
        return answer;
    }
    
	
	public static void main(String[] args) {
	int n = 6;
	solution(n);
	
	}
}