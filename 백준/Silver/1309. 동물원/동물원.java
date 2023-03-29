import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[] zoo = new long[N];
        zoo[0] = 3;
        if (N==1){
            bw.write(zoo[N-1]+"");
        }
        else{
            zoo[1] =7;
            for (int i = 2; i < N; i++) {
                zoo[i] = ((zoo[i-2]+(zoo[i-1]*2))%9901);
            }
            bw.write(zoo[N-1]+"");
        }
        bw.flush();
        bw.close();
    }
}
