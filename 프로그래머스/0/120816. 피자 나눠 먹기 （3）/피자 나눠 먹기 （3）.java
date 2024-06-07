class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        for (int i = slice; i <= slice*n; i+=slice) {
            answer++;
            if (i / n != 0){
                break;
            }
        }
        return answer;
    }
}