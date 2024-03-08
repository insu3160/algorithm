import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            String[] cary = sc.next().split("");
            for (int j = 0; j < cary.length; j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(cary[j]);
                }
            }
            System.out.println();
        }
    }
}
