import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        String[] sary = my_string.split("");
        Arrays.sort(sary);
        String answer="";
        for (int i = 0; i < sary.length; i++) {
            answer+=sary[i];
        }
        return answer;
    }
}