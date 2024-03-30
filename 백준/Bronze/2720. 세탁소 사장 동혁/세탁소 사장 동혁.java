import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int[] ary = new int[4];
            int a = sc.nextInt();
            ary[0] = a/25;
            a %= 25;
            ary[1] = a/10;
            a %= 10;
            ary[2] = a/5;
            a%=5;
            ary[3] = a;
            for (int j = 0; j < ary.length; j++) {
                System.out.print(ary[j]+" ");
            }
            System.out.println();
        }
    }
}
