import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Basket = scanner.nextInt();
        int N = scanner.nextInt();
        int[] Array = new int[Basket];
        for (int i = 1; i <= Array.length; i++) {
            Array[i - 1] = i;
        }
        for (int i = 0; i < N; i++) {
            int b = scanner.nextInt();
            int e = scanner.nextInt();
            int m = scanner.nextInt();
            b-=1;
            e-=1;
            m-=1;
            int B = b;
            int ABB = 0;
            int AB = 0;
            int[] ArrayB = new int[Basket];
            for (int z = b; z < m ; z++) {
                ArrayB[ABB] = Array[z];
                ABB += 1;
            }
            for (int k = m; k <= e; k++) {
                Array[B] = Array[k];
                B++;
            }
            for (int j = e-m+b+1; j <= e; j++) {
                Array[j] = ArrayB[AB];
                AB++;
            }
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+" ");
        }
    }
}