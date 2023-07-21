import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result=1;
        int n = Integer.parseInt(br.readLine());
        int ary[] = new int[100000000];
        ary[0] = 1;
        ary[1] = 2;
        for (int i = 2; i < n; i++) {
            ary[i] = (ary[i-2]+ary[i-1])%15746;
        }
        bw.write(ary[n-1]+"");
        bw.flush();
        bw.close();
    }
}
