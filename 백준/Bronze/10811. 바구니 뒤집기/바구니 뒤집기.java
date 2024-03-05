import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ary = new int[n];
        for (int i = 1; i <= n; i++) {
            ary[i-1] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int c = a;
            for (int j = 0; j <= ((b-a)/2); j++) {
                int temp = ary[b-j];
                ary[b-j] = ary[c];
                ary[c] = temp;
                c++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ary[i]+" ");
        }
    }
}
