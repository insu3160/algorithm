import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String answer = solution(s);
        System.out.println(answer);
    }
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr2);
        answer = arr2[0] +" "+arr2[arr.length-1];

        return answer;
    }
}
