import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        long l = 0;
        List<Integer> list = new ArrayList<>();
        while (n>0){
            list.add((int) (n%10));
            n/=10;
        }
        list = list.stream()
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            l += list.get(i)*Math.pow(10,i);
        }
        return l;
    }
}