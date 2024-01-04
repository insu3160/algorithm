import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).boxed().mapToInt(o-> o*2).toArray();
    }
}