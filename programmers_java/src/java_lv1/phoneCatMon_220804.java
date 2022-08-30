package java_lv1;

import java.util.HashSet;

public class phoneCatMon_220804 {

    public static int solution(int[] nums) {
        int max = nums.length / 2  ;
        
        HashSet<Integer> numsSet = new HashSet<Integer>();
        
        // 중복을 제거한 배열을 hashset에 넣는다.
        for (int num : nums) {
        	numsSet.add(num);
        }
        
        // 중복을 제거한 hashset의 크기와 max를 비교함. 
        if (numsSet.size() > max) {
        	return max;
        } else {
        	return numsSet.size();
        }
    }

	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		solution(nums);

	}
}