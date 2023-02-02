import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int K = scanner.nextInt();
        int ary[] = new int[N];
        for (int i = 0; i <= N; i++) {
            if (i==X){
                ary[i-1] = 1;
            }

        }
        for (int i = 0; i < K; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int temp;
            temp = ary[n1-1];
            ary[n1-1] = ary[n2-1];
            ary[n2-1] = temp;
        }
        for (int i = 0; i < ary.length; i++) {
            if(ary[i]==1){
                System.out.println(i+1);
                break;
            }
        }
    }
}