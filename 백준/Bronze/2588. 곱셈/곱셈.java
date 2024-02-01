import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int one = b%10;
        int ten = (b%100)/10;
        int beak = b/100;
        System.out.println(a*one);
        System.out.println(a*ten);
        System.out.println(a*beak);
        System.out.println((a*one)+(a*ten*10)+(a*beak*100));
    }
}
