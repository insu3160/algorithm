import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long a = (long) Math.pow((Math.pow(2,n)+1),2);
        System.out.println(a);
    }
}
