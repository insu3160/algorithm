import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a>b ? gcd(a,b) : gcd(b,a);
            a/=result;
            b/=result;
            System.out.println(result*a*b);
        }
    }
    public static int gcd(int a, int b) {
        if(a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}
