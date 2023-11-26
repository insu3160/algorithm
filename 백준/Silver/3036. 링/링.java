import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] sarray = br.readLine().split(" ");
        int a = Integer.parseInt(sarray[0]);
        for (int i = 1; i < sarray.length; i++) {
            int b = Integer.parseInt(sarray[i]);
            int gcd = gcd(a,b);
            bw.write(a/gcd+"/"+b/gcd);
            bw.write("\n");
        }
        bw.close();
    }
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
