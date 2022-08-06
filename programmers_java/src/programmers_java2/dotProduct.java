package programmers_java2;

public class dotProduct {

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        
        //a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
        
        for (int i = 0; i < a.length; i++) {
        	answer += a[i]*b[i];
        }
        System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		solution(a, b);
	}
}
