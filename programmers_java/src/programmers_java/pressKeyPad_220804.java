package programmers_java;

public class pressKeyPad_220804 {

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = 10; // *을 10으로 표현함.
        int right = 12; //#을 12로 표현함.
        
        for ( int n : numbers) {
        	if (n == 1 || n == 4 || n == 7) { // 누르려는 키패드가 1, 4, 7 일때 
        		answer += "L";
        		left = n;
        	} else if (n == 3 || n == 6 || n == 9) { // 누르려는 키패드가 3, 6, 9 일때
        		answer +="R";
        		right = n;
        	} else { // 그외의 숫자를 누르려 할 때
        		if (n == 0) n = 11; // 0을 누르려 할 때
        		
        		// 오른손, 왼손으로 해당 키패드를 누를때의 거리 계산
        		int leftDist = Math.abs(n - left) / 3 + Math.abs(n - left) % 3;
        		int rightDist = Math.abs(n - right) / 3 + Math.abs(n - right) % 3;
        		
        		if (leftDist < rightDist) { //오른손보다 왼손이 더 멀때 
        			answer += "L";
        			left = n;
        		} else if (leftDist > rightDist) { // 오른보다 왼손이 더 가까울 때 
        			answer += "R";
        			right = n;
        		} else { // 둘이 거리가 똑같을 때
        			if (hand.equals("left")) { // 왼손 잡이일 때 
        				answer += "L";
        				left = n;
        			} else { // 오른손 잡이일 때
        				answer += "R";
        				right = n;
        			}
        		}
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		solution(numbers, hand);

	}
}