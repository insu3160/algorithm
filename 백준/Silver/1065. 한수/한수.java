import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        int x = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i<100){
                c++;
            }
            else {
                int n = (i%10) - ((i/10)%10);
                int n2 = ((i/10)%10)-(i/100);
                if(n ==n2){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}