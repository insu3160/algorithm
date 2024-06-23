class Solution {
    public int solution(int n) {
        int answer = 1;
        int c = 0;
        for (int i = 1; i <= 10; i++) {
            answer*=i;
            if (n<answer){
                c=i-1;
                break;
            }else if(n==answer){
                c=i;
                break;
            }
        }
        return c;
    }
}