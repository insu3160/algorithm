import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        int[] arr= new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double answer = solution(arr);

        System.out.println(answer);
    }
    public static double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);

    }
}
