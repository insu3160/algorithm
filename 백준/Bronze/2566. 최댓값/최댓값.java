import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ary = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                ary[i][j] = sc.nextInt();
            }
        }
        max = Arrays.stream(ary).flatMapToInt(list -> Arrays.stream(list)).max().getAsInt();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ary[i][j] == max){
                    x=i+1;
                    y=j+1;
                    break;
                }
            }
        }
        System.out.println(max);
        System.out.println(x+" "+y);
    }
}
