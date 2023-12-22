import java.util.Arrays;

class Solution {
    public Object[] solution(String[] strlist) {
        Object[] answer = {};
        answer = Arrays.stream(strlist).map(o -> o.length()).toArray();
        return answer;
    }
}