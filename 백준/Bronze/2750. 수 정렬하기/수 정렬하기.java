import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        ary = Arrays.stream(ary).sorted().toArray();
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
        }
    }
}
