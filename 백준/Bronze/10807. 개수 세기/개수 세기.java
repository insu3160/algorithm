import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str;
        str = br.readLine().split(" ");
        String cor = br.readLine();
        System.out.println(Arrays.stream(str).filter(o -> o.equals(cor)).count());
    }
}
