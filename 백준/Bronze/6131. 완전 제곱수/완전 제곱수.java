import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int c=0;
        for (int i = 1; i <=500 ; i++) {
            for (int j = 1; j < i; j++) {
                if (i*i-j*j == N){
                    c++;
                }
            }
        }
        System.out.println(c);

    }
}