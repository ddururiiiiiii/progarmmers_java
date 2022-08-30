package java_lv1_2;

public class noNum {

	public static int solution(int[] numbers) {
		int answer = 45;
		
		for (int i = 0; i < numbers.length; i++) {
			answer -= numbers[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		solution(numbers);
	}
}
