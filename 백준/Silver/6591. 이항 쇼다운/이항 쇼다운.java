import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n;
        int k;
        BigInteger top;
        BigInteger bot;
        int result;
        while (true){
            st = new StringTokenizer(br.readLine()," ");
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            top = BigInteger.ONE;
            bot = BigInteger.ONE;
            if (n==0 && k==0){
                break;
            }
            if (k==0||n==k){
                bw.write(1+"\n");
            }
            else {
                if (n / 2 < k) {
                    k = n - k;
                }
                long tn = n;
                long bn = k;
                for (int i = 0; i < k; i++) {
                   top = top.multiply(BigInteger.valueOf(tn));

                    bot =bot.multiply(BigInteger.valueOf(bn));
                    tn--;
                    bn--;
                }
                result = top.divide(bot).intValue();
                bw.write(result+"\n");
            }

        }
        bw.flush();
        bw.close();
    }


}
