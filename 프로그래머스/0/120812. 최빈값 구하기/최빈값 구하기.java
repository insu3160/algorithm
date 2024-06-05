import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] ary = new int[1000];
        for (int i = 0; i < array.length; i++) {
            ary[array[i]]++;
        }
        int[] aary = Arrays.stream(ary).sorted().toArray();
        System.out.println(aary[999]);
        if (aary[999] == aary[998]){
            answer = -1;
        }
        else {
            for (int i = 0; i < ary.length; i++) {
                if (ary[i] == aary[999]){
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}