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
            if(a >= b){
                for (int j = b; j >0 ; j--) {
                    if (a % j == 0 && b % j == 0) {
                        maxNum[i] = j;
                        minNum[i] = a * b / j;
                        break;
                    }

                }
            }
            else {
                for (int j = a; j >0 ; j--) {
                    if (a % j == 0 && b % j == 0) {
                        maxNum[i] = j;
                        minNum[i] = a * b / j;
                        break;
                    }

                }
            }


        }
        for (int p = 0; p < minNum.length; p++) {
            System.out.print(minNum[p]+" ");
            System.out.println(maxNum[p]);
            }

    }
}