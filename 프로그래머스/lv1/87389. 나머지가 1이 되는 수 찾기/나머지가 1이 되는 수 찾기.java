import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = solution(n);
        System.out.println(answer);
    }
    public static int solution(int n) {
        int answer = 0;
            for (int i = 1; i < n; i++) {
                if (n%i==1){
                    answer =i;
                    break;
                }
            }

        return answer;
    }
}
