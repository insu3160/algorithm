import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long g = n > m ? gcd(n,m) : gcd(m,n);
        n/=g;
        m/=g;
        bw.write((n*m*g)+"");
        bw.flush();
        bw.close();

    }
    public static long gcd(long a, long b) {
        if(a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}
