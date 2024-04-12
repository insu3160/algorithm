import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xary = new int[n];
        int[] yary = new int[n];
        if (n==1){
            System.out.println(0);
        }
        else {
            for (int i = 0; i < n; i++) {
                xary[i] = sc.nextInt();
                yary[i] = sc.nextInt();
            }
            int x = Arrays.stream(xary).max().getAsInt()- Arrays.stream(xary).min().getAsInt();
            int y = Arrays.stream(yary).max().getAsInt()- Arrays.stream(yary).min().getAsInt();
            System.out.println(x*y);
        }
    }
}
