import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ba = new int[n];
        for (int i = 0; i < m; i++) {
            int f = sc.nextInt();
            int l = sc.nextInt();
            int g = sc.nextInt();
            for (int j = f-1; j < l; j++) {
                ba[j]=g;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ba[i]+" ");
        }
    }
}
