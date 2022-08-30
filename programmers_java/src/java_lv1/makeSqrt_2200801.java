package java_lv1;

public class makeSqrt_2200801 {
	
    public static long solution(long n) {
        long answer = -1;
        
        Double val = Math.sqrt(n);
        
        if (val == val.intValue()) {
        	answer = (long) Math.pow(val+1, 2);
        }
        
        return answer;
    }
	public static void main(String[] args) {
	long n = 121;
	solution(n);
	
	}
}