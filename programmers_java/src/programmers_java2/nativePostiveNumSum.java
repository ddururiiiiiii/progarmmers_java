package programmers_java2;

public class nativePostiveNumSum {

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
        	if (signs[i] == true) absolutes[i] = Math.abs(absolutes[i]);
        	if (signs[i] == false) absolutes[i] = absolutes[i] * -1;
        }
        
        for (int i = 0; i < absolutes.length; i++) {
        	answer += absolutes[i];
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		solution(absolutes, signs);
	}
}
