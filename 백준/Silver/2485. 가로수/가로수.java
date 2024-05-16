import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];
        int[] av = new int[n-1];
        ary[0] = Integer.parseInt(br.readLine());
        for (int i = 1; i < n; i++) {
            ary[i] = Integer.parseInt(br.readLine());
            av[i-1] = ary[i] - ary[i-1];
        }
        int g = gcd(av[0],av[1]);
        for (int i = 2; i < av.length; i++) {
            g = gcd(av[i], g);
        }
        int count=0;
        for (int i = 0; i < n - 1; i++) {  // 가로수 사이의 거리 / gcd -1
            count += ((av[i] / g) - 1);
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
    public static int gcd(int a, int b){
        if (a%b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
}
