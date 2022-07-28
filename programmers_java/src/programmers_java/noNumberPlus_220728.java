package programmers_java;

public class noNumberPlus_220728 {
	
        public static int solution(String s) {
        	int answer = 0;
        	String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            
        	for (int i = 0; i < arr.length; i++) {
        		s = s.replace(arr[i], Integer.toString(i));
        	}
            answer = Integer.parseInt(s);
            System.out.println(answer);
            return answer;
        }
    
	
	public static void main(String[] args) {
	String s = "one4seveneight";
	solution(s);
	
	}
}