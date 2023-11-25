import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Long> countMap = new HashMap<>();

        for (int num : tangerine) {
            countMap.put(num, countMap.getOrDefault(num, 0L) + 1);
        }
        List<Integer> countList = countMap.values().stream()
                .map(Long::intValue)
                .collect(Collectors.toList());
        List<Integer> sortedList= countList.stream()
                .sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList());
        for (int i = sortedList.size()-1; i >=0 ; i--) {
            if (k<=0){
                break;
            }
            else{
                k-=sortedList.get(i);
                answer++;
            }
        }
        return answer;
    }
}