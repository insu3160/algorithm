class Solution {
   public static String solution(String s) {
        String answer = "";
        int[] ary = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ary[s.charAt(i)-97]++;
        }
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == 1){
                answer+=(char)(i+97);
            }
        }
        return answer;
    }

}