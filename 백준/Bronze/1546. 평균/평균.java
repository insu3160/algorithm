import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] ary = new double[n];
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        double max = Arrays.stream(ary).max().getAsDouble();
        for (int i = 0; i < n; i++) {
            ary[i] = (ary[i]/max)*100;
        }
        System.out.println(Arrays.stream(ary).average().getAsDouble());
    }
}
