class Solution {
     public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        int[] ary = new int[53];
        for (int i = 0; i <my_string.length() ; i++) {
            if (my_string.charAt(i)>=97 && my_string.charAt(i)<=122){
                if (ary[my_string.charAt(i)-97] == 0){
                    answer.append(my_string.charAt(i));
                    ary[my_string.charAt(i)-97]=1;
                }
                else{
                    ary[my_string.charAt(i)-97]=1;
                }
            }
            else if(my_string.charAt(i)>=65 && my_string.charAt(i)<=90){
                if (ary[my_string.charAt(i)-39] == 0){
                    answer.append(my_string.charAt(i));
                    ary[my_string.charAt(i)-39]=1;
                }
                else{
                    ary[my_string.charAt(i)-39]=1;
                }
            }
            else{
                if (ary[52] == 0){
                    answer.append(my_string.charAt(i));
                    ary[52]=1;
                }
                else{
                    ary[52]=1;
                }
            }
        }
        return answer.toString();
    }
}