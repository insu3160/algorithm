import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public Object[] solution(int[] num_list) {
        List<Integer> list = Arrays.asList(Arrays.stream(num_list).boxed().toArray(Integer[]::new));
        Collections.reverse(list);
        return list.stream().toArray();
    }
}