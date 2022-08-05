package programmers_java2;

public class stringDesc {

	public static boolean solution(String s) {
		boolean answer = false;
		
		if (s.length() == 4 || s.length() == 6) {
			if (s.matches("[0-9]+")) answer = true;
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		String s = "a456";
		solution(s);
	}
}
