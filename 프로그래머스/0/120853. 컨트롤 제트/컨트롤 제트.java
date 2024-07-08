import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solution(String s) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList(s.split(" ")));
        String z = "Z";
        int sum = 0;

        while (items.contains(z)) {
            items.remove(items.indexOf(z) - 1);
            items.remove(items.indexOf(z));
        }
        for (int i = 0; i < items.size(); i++)
            sum += Integer.parseInt(items.get(i));
        return sum;
    }
}
