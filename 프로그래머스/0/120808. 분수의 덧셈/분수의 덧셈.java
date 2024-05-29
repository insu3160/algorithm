

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        numer1 *= denom2;
        numer2 *= denom1;
        denom1 *= denom2;
        answer[0] = numer1+numer2;
        answer[1] = denom1;
        int a = gcd(answer[0],answer[1]);
        answer[0] /= a;
        answer[1] /= a;
        return answer;
    }
    public static int gcd(int a, int b) {
        if(a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}