import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ary[] = new int[N];

        for (int i = N; i >=4 ; i--) {
            int k = i;

            while (k >= 4) {

                if (k % 10 == 4 || k % 10 == 7) {
                    if(k == 4 || k == 7){
                        ary[0] = i;
                        break;
                    }
                    else {
                        k/=10;
                    }

                } else {
                    break;
                }
            }
            if (ary[0] != 0){
                break;
            }

        }
        System.out.println(ary[0]);
    }

}