import java.util.*;
class Solution {
    public Object[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            if (n%i==0)  {
                if(i*i == n){
                    list.add(i);
                }
                else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        return list.stream().sorted().toArray();
    }
}