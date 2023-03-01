import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt=1;
    private static long fac(int n) {
        if (n == 0){
            return cnt;
        }
        else {
            cnt*=n;
            return fac(n-1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = fac(n);
        System.out.println(result);
    }


}