import java.io.*;
import java.util.Scanner;

public class Main {
    public static int max(int a, int b){
        if (b>a){
            return max(b,a);
        }
        if (a%b == 0){
            return b;
        }
        return max(b ,a%b);
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int am = scanner.nextInt();
        int b = scanner.nextInt();
        int bm = scanner.nextInt();

        int reja = (bm*a) + (am*b);
        int remo = (bm*am);
        if (bm==am){
            reja = a+b;
            remo = am;
        }
        else {
            reja = (bm * a) + (am * b);
            remo = (bm * am);
        }
        int per = max(reja,remo);
        System.out.println(reja/per+" "+remo/per);
    }

}