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
        boolean[] primeArray = eratosthenes();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            int c = 0;
            for (int j = 2; j <= a / 2; j++) {
                if(!primeArray[j] && !primeArray[a - j]) {
                    c++;
                }
            }
            bw.write(c+"\n");
            }
        
        bw.flush();
        bw.close();
    }
    
    private static boolean[] eratosthenes() {
        boolean[] primeArray = new boolean[1000001];
        primeArray[0] = primeArray[1] = true;

        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (primeArray[i]) continue;

            for (int j = i + i; j < 1000001; j += i) {
                primeArray[j] = true;
            }
        }

        return primeArray;
    }
}
