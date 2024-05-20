    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.OutputStreamWriter;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            while (true){
                int n = Integer.parseInt(br.readLine());
                if (n == 0){
                    break;
                }
                if (n==1 || n==2){
                    bw.write(1+"\n");
                }
                else {
                    int c = 0;
                    for (int i = n+1; i < 2 * n; i++) {
                        if (isPrime(i)) {
                            c++;
                        }
                    }
                    bw.write(c + "\n");
                }
            }
            bw.flush();
            bw.close();
        }
        private static boolean isPrime(int a) {
            for (int i = 2; i*i <= a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
