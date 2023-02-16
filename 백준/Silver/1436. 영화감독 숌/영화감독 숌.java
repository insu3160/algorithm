import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a=666;
        int d = 0;
        while (true){
            int b = a;
            int c = 0;
            while (b>0){
                if (b%1000 == 666 ){
                    c++;

                }
                b/=10;
            }
            if (c>=1){
                d++;
                if (d==n){
                    System.out.print(a);
                    break;
                }
            }
            a++;
        }

    }
}