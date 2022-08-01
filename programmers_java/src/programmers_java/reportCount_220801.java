package programmers_java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class reportCount_220801 {
	
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();
 
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }
        
        for (String s : report) {
            String[] str = s.split(" ");
            map.get(str[1]).add(str[0]);
        }
        
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }
        return answer;
    }
    
	public static void main(String[] args) {
	String[] id_list = {"muzi", "frodo", "apeach", "neo"};
	String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
	int k = 2;
	solution(id_list, report, k);
	
	}
}