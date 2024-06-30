import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public static int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i)-48>=0 && my_string.charAt(i)-48<=9){
                list.add((int) my_string.charAt(i)-48);
            }
        }
        return list.stream().mapToInt(Integer::valueOf).sorted().toArray();
    }
}