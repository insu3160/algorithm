import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int index = Arrays.asList(seoul).indexOf("Kim");
        answer = "김서방은 %d에 있다";
        return String.format(answer,index);
    }
}