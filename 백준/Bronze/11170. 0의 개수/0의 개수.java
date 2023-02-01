import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int C = 0;
            for (int j = N; j <= M ; j++) {
                int k = j;
                if(k==0){
                    C++;
                }
                else{
                    while(k>=10){
                        if (k%10 ==0) C++;
                        k /= 10;
                    }
                }


            }
            System.out.println(C);
        }
    }
}