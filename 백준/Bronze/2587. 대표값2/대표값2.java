import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ary = new int[5];
        for (int i = 0; i < 5; i++) {
            ary[i] = sc.nextInt();
        }
        System.out.println((int)Arrays.stream(ary).average().getAsDouble());
        System.out.println(Arrays.stream(ary).sorted().toArray()[2]);
    }
}
