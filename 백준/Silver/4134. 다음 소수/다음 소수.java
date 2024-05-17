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
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(br.readLine());
            if (a == 1 || a == 0 || a == 2){
                bw.write(2+"\n");
            }
            else {
                while (true){
                    if (isPrime(a)){
                        bw.write(a+"\n");
                        break;
                    }
                    a++;
                }
            }
        }
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(long a) {
        for (long i = 2; i*i <= a; i++) {
            if (a%i == 0){
                return false;
            }
        }
        return true;
    }
}
