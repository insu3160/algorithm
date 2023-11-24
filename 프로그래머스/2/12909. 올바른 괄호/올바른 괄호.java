import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<String> bracketstack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                bracketstack.push("(");
            }
            else {
                if (bracketstack.empty()){
                    answer = false;
                    break;
                }
                else {
                    bracketstack.pop();
                }
            }
        }
        if (!bracketstack.empty()){
            answer = false;
        }
        return answer;
    }
}