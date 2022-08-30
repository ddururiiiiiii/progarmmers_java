package java_lv1;

public class recommandId_220727 {
		
	    public static String solution(String new_id) {
	        String answer = "";
	        
	        //1단계 - 대문자 -> 소문자 치
	        answer = new_id.toLowerCase();
	        //System.out.println("1단계 : " + answer);
	        
	        //2단계 - 알파벳 소문자, 숫자, 빽, 밑줄, 마침표제외하고 문자 제거.
	        answer = answer.replaceAll("[^-_.a-z0-9]", ""); 
	        //System.out.println("2단계 : " + answer);
	        
	        //3단계 -마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환.
	        answer = answer.replaceAll("[.]{2,}", "."); 
	        //System.out.println("3단계 : " + answer);
	        
	        //4단계 - 마침표가 처음이나 끝에 위치하면 제거.
	        answer = answer.replaceAll("^[.]|[.]$", "");
	        //System.out.println("4단계 : " + answer);
	       
	        //5단계 - 빈 문자열이라면 a를 대입함.
	        if (answer.equals("")) {
	        	answer += "a";
	        }
	        //System.out.println("5단계 : " + answer);
	        
	        //6단계 - 길이가 16자 이상이라면, 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거함.
	        if (answer.length() >= 16 ) {
	        	answer = answer.substring(0, 15);
	        	answer = answer.replaceAll("[.]$","");
	        }
	        //System.out.println("6단계 : " + answer);
	        
	        //7단계 - 길이가 2자 이하라면 마지막 문자를 길이가 3이 될때까지 반복해서 끝에 붙임. 
	        if (answer.length() <= 2) {  // 7단계
	            while (answer.length() < 3) {
	                answer += answer.charAt(answer.length()-1);
	            }
	        }
	        
	     // System.out.println("7단계 : " + answer);
	        return answer;
	    }
		
		public static void main(String[] args) {
		//String new_id = "...!@BaT#*..y.abcdefghijklm";
		//String new_id = "z-+.^.";
		//String new_id = "=.=";
		//String new_id = "123_.def";
		String new_id = "abcdefghijklmn.p";
		
		solution(new_id);
		
		}
}
