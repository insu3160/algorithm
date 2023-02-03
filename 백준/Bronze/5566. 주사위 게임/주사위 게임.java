import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int result = 0;
        int[] ary = new int[2000];
        for (int i = 0; i < N; i++) {
            ary[i] = scanner.nextInt();
        }
        int[] dice = new int[M];
        for (int i = 0; i < M; i++) {
            dice[i] = scanner.nextInt();
        }
        for (int i = 0; i < M; i++) {
            result += (dice[i] + ary[dice[i]+result]);
            if (result>=N-1){
                System.out.println(i+1);
                break;
            }
        }

    }
}