package programmers_java;

public class elsePrice_2200801 {
	
    public static long solution(int price, int money, int count) {
       long answer = 0;
       long finalPrice = 0;
	   
       for (int i = 1; i < count+1; i++) {
		   finalPrice += price * i;
	   }
	   
       if (finalPrice > money) {
    	   answer = finalPrice - money;
       }
        System.out.println(answer);

	    return answer;
    }
	
	public static void main(String[] args) {
	int price = 3;
	int money = 20;
	int count = 4;
	solution(price, money, count);
	
	}
}