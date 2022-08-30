package java_lv1_2;

public class stringCare {

    public static int solution(String s) {
        int answer = 0;
        String[] englishWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < englishWord.length; i++) {
        	s = s.replaceAll(englishWord[i], Integer.toString(i));
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }

	public static void main(String[] args) {
		String s = "one4seveneight";
		solution(s);
	}
}
