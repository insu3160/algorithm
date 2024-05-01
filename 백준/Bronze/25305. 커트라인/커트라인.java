import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        System.out.println(Arrays.stream(ary).sorted().toArray()[n-k]);
    }
}
