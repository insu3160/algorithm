import java.util.Arrays;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] py = s.split("");
        int pcount = (int) Arrays.stream(py)
                .filter(p -> p.equals("p") || p.equals("P"))
                .count();
        int ycount = (int) Arrays.stream(py)
                .filter(y -> y.equals("y") || y.equals("Y"))
                .count();
        if (pcount != ycount){
            answer = false;
        }
        return answer;
    }
}