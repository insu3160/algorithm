class Solution {
   public StringBuilder solution(String my_string, int num1, int num2) {

        char a = my_string.charAt(num2);
        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num2, my_string.charAt(num1));
        sb.setCharAt(num1, a);
        return sb;
    }
}