import java.util.*;
class Solution {
     public static int solution(int order) {
        String s = String.valueOf(order);
        String[] orderAry = s.split("");

        return (int) Arrays.stream(orderAry).mapToInt(Integer::parseInt)
                .filter(o->o==3 || o==6 || o==9)
                .count();
    }
}