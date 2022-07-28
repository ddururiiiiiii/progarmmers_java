package programmers_java;

public class noPlayer_220728 {
	
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        // true, false에 따라서 음수양수 변환 
        for (int i = 0 ; i < signs.length; i++) {
        	if (signs[i] == true) {
        		absolutes[i] = Math.abs(absolutes[i]);
        	}
        	if (signs[i] == false) {
        		absolutes[i] = absolutes[i] * -1;
        	}
        }
        
        // 변환된 숫자 더하기 
        for (int j = 0; j < absolutes.length; j++) {
        	answer += absolutes[j];
        }
        System.out.println(answer);
        return answer;
    }
    
	
	public static void main(String[] args) {
//	int[] absolutes = {4,7,12};
	int[] absolutes = {1,2,3};
//	boolean[] signs = {true,false,true};
	boolean[] signs = {false,false,true};
	solution(absolutes, signs);
	
	}
}