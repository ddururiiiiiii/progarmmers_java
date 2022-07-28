package programmers_java;

public class phoneNumberHide_220728 {
	
    public static String solution(String phone_number) {
        String answer = "";
        String hideNum = "";
        
        int hideNumLength = phone_number.length()-4;
        
        for (int i  = 0; i < hideNumLength; i++) {
        	hideNum += "*";
        }
        String showNum = phone_number.substring(phone_number.length()-4, phone_number.length());
        
        answer = hideNum + showNum;
       // System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
	String phone_number = "01033334444";	
	solution(phone_number);
	
	}
}