import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long ary[][] = new long[n+1][2];
        ary[0][0] = 0;
        ary[0][1] = 1;
        for (int i = 1; i < n; i++) {
            ary[i][0] = ary[i-1][0]+ary[i-1][1];
            ary[i][1] = ary[i-1][0];
        }
        long result = ary[n-1][0]+ary[n-1][1];
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}