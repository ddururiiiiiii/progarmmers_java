package programmers_java2;

public class year2016 {

    public static String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] mon = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int days = 0;
        int i;
        for (i = 0; i < a-1; i++) {
        	days += mon[i];
        }
        
        days += b-1;
        answer = day[days % 7];
        
        return answer;
    }

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		solution(a, b);
	}
}
