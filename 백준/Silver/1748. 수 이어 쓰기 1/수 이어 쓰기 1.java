import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (i<10){
                c+=1;
            }
            else if (i<100 &&i>=10){
                c+=2;
            }
            else if (i<1000 && i>=100){
                c+=3;
            }
            else if (i<10000 && i>=1000){
                c+=4;
            }
            else if (i<100000 && i>=10000){
                c+=5;
            }
            else if (i<1000000 && i>=100000){
                c+=6;
            }
            else if (i<10000000 && i>=1000000){
                c+=7;
            }
            else if (i<100000000 && i>=10000000){
                c+=8;
            }
            else {
                c+=9;
            }
        }
        System.out.print(c);

    }
}