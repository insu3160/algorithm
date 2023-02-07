import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int correct[] = new int[] {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int ary[] = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
            int k = N;
            int x = 1;
            if (N == 0){
                System.out.println("Case #"+(i+1)+": INSOMNIA");
            }
            else {
                while(k!=0){
                    ary[k%10] = k%10;
                    k /= 10;
                    if (k == 0){
                        if (Arrays.equals(ary,correct)){
                            System.out.println("Case #"+(i+1)+": "+ N*x);
                        }
                        else {
                            x++;
                            k = N*x;

                        }
                    }
                }
            }


        }
    }


}
