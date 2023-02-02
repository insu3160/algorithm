import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ary[] = new int[5];
        int cor[] = new int[]{1,2,3,4,5};
        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
        }
        int i = 0;
        while (!Arrays.equals(ary, cor)) {
            if(ary[i]>ary[i+1]){
                int temp = ary[i];
                ary[i] = ary[i+1];
                ary[i+1] = temp;
                for (int j = 0; j < ary.length; j++) {
                    System.out.print(ary[j]+" ");
                }
                System.out.print("\n");
            }
            i++;
            if(i>=4){
                i = 0;
            }

        }
    }
}