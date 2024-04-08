import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y =sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int xdis = Math.abs(x-w) > x ? x : Math.abs(x-w);
        int ydis = Math.abs(y-h) > y ? y : Math.abs(y-h);
        System.out.println(xdis>ydis? ydis : xdis);

    }
}
