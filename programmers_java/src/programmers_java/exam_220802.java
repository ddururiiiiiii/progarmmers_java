package programmers_java;

import java.util.ArrayList;
import java.util.Arrays;

public class exam_220802 {
	
    public static int[] solution(int[] answers) {
    	
    	// 수포자 3명의 찍은 번호들
    	int[] sopoja1 = {1, 2, 3, 4, 5};
    	int[] sopoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
    	int[] sopoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
    	// 수포자 3명의 맞은 갯수를 담을 배열
    	int[] count = new int[3];
    	
    	// 수포자 3명의 맞은 갯수를 담는
        for (int i = 0; i < answers.length; i++) {
        	if (answers[i] == sopoja1[i%5]) count[0]++;
        	if (answers[i] == sopoja2[i%8]) count[1]++;
        	if (answers[i] == sopoja3[i%10]) count[2]++;
        }
        
        // 수포자 3명 중에 가장 많이 맞춘 사람 찾기
        int max = Math.max(Math.max(count[0], count[1]), count[2]);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if (max == count[0])  list.add(1);
        if (max == count[1])  list.add(2);
        if (max == count[2])  list.add(3);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    
	public static void main(String[] args) {
	int[] answers = {1,2,3,4,5};
	solution(answers);
	
	}
}