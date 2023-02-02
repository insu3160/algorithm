import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] ary = new int[T];
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            BigInteger top = BigInteger.ONE;
            BigInteger bottom = BigInteger.ONE;
            for (int j = 1; j <= N; j++) {
                top = top.multiply(BigInteger.valueOf(M-j+1));
                bottom=bottom.multiply(BigInteger.valueOf(j));
            }
            System.out.println(top.divide(bottom));
        }

    }

}