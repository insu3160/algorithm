import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        long[] answer = solution(x,n);
        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
    }
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x *(i+1);
        }
        return answer;
    }
}
