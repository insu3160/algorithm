import java.util.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        int[] nary = Arrays.stream(ary).filter(o -> o<max).toArray();
        for (int i = 0; i < nary.length; i++) {
            System.out.print(nary[i]+" ");
        }
    }
}
