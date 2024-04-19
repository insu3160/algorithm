import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger a = new BigInteger(String.valueOf(n));
        BigInteger b = a.multiply(a);
        BigInteger c = b.multiply(a);
        System.out.println(c);
        System.out.println(3);
    }
}
