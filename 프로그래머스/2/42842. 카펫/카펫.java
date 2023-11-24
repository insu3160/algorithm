import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int brown, int yellow) {
        List<Integer> list = new ArrayList<>();
        for (int x = 1; x < brown+yellow; x++) {
            for (int y = 1; y < brown+yellow; y++) {
                if (x*y == brown+yellow && (x-2)*(y-2)==yellow){
                    list.add(y);
                    list.add(x);
                    break;
                }
            }
            if (!list.isEmpty()){
                break;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}