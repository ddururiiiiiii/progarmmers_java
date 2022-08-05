package programmers_java;

import java.util.ArrayList;
import java.util.List;

public class fail_220804 {

	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double users =stages.length;
        List<double[]> fail_rate = new ArrayList<>();
        
        int cnt=0;
        
        for(int i = 1;i <= N;i++){
            for(int j = 0;j < stages.length;j++){
                if(i == stages[j]){
                    cnt++;
                }
            }
           if(cnt == 0){
              fail_rate.add(new double[]{i,0});
              continue;
          }
          fail_rate.add(new double[]{i,cnt/users});
          users -= cnt;
          cnt=0;
        }
        
        fail_rate.sort((a,b)->Double.compare(b[1],a[1]));
        
        for(int i = 0;i < fail_rate.size(); i++){
            answer[i] = (int)fail_rate.get(i)[0];
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		solution(N, stages);

	}
}