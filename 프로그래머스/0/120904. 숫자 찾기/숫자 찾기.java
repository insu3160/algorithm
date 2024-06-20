class Solution {
    public static int solution(int num, int k) {
        int answer = -1;
        String s = String.valueOf(num);
        String[] numary = s.split("");
        for (int i = 0; i < numary.length; i++) {
            if (numary[i].equals(String.valueOf(k))){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}