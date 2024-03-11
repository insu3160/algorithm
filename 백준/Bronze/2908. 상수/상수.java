import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int aa = Integer.parseInt(String.valueOf(new StringBuilder(a).reverse()));
        int bb = Integer.parseInt(String.valueOf(new StringBuilder(b).reverse()));
        System.out.println(Math.max(aa,bb));

    }
}
