class Solution {
    public long solution(int n) {
        int[] arr = new int[100000];
        arr[0] = 1;
        arr[1] = 2;
        if (n>=2){
            for (int i = 2; i <=n ; i++) {
                arr[i] = (arr[i-1]+arr[i-2])%1234567;
            }
        }
        return arr[n-1];
    }
}