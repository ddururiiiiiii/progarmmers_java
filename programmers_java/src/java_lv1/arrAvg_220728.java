package java_lv1;

public class arrAvg_220728 {
	
    public static double solution(int[] arr) {
        double answer = 0;
        
        for (int i = 0 ; i < arr.length; i++) {
        	answer += arr[i];
        }
        
        answer = answer / arr.length;
        
        System.out.println(answer);
        return answer;
    }
    
	
	public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4};
	solution(arr);
	
	}
}