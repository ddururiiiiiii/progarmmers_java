package programmers_java;

public class vocal_220727 {
	
    public static int solution(int[] numbers) {
        int answer = 45;
        
        for (int i = 0; i < numbers.length; i++) {
        	answer -= numbers[i];
        }
        
        System.out.println(answer);
        
        return answer;
        }
    
	
	public static void main(String[] args) {
//	int[] numbers = {1,2,3,4,6,7,8,0};
		int[] numbers = {5,8,4,0,6,7,9};
	solution(numbers);
	
	}
}