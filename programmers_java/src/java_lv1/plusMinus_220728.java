package java_lv1;

import java.util.Arrays;

public class plusMinus_220728 {
	
    public static String solution(String[] participant, String[] completion) {
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i; 
        for (i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i]))
               return participant[i];
        }
        System.out.println(participant[i]);
        return participant[i];
    }
    
	
	public static void main(String[] args) {
	String[] participant = {"leo", "kiki", "eden"};
	String[] completion = {"eden", "kiki"};
	solution(participant, completion);
	
	}
}