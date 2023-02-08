import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
        }while (n > 100000 || n < 2);

        long ary[] = new long[n];
        long arysum[] = new long[n];
        for (int i = 0; i < n; i++) {
            ary[i] = scanner.nextInt();
        }
        
        arysum[0] = ary[0];
        
        for (int i = 1; i < n; i++) {
            arysum[i] = arysum[i-1] + ary[i];
        }
        
        long sum = 0;
        
        for (int i = 0; i < n-1; i++) {
            sum += ary[i]*(arysum[n-1]-arysum[i]);
        }


        System.out.print(sum);
    }
}