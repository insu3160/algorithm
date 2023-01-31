import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] maxNum = new int[n];
        int[] minNum = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            maxNum[i] = max(a, b);
            minNum[i] = a*b/maxNum[i];


        }
        for (int i = 0; i < minNum.length; i++) {
            System.out.print(minNum[i]+" ");
            System.out.println(maxNum[i]);
        }

    }
    public static int max(int a, int b){
        if (a%b == 0){
            return b;
        }
        return max(b ,a%b);
    }
}