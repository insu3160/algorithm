import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ary = new int[30];
        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            ary[a-1] = 3;
        }
        for (int i = 0; i < 30; i++) {
            if (ary[i] != 3){
                System.out.println(i+1);
            }
        }
    }
}
