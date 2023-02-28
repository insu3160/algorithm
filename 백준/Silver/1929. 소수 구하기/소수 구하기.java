import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int ary[] = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i]=i+1;
        }
        ary[0]=0;
        for (int i = 1; i < n; i++) {
            if (ary[i]!=0){
                for (int j = ary[i]+ary[i]; j <= n; j+=ary[i]) {
                    ary[j-1] = 0;
                }
            }
        }
        for (int i = m-1; i < ary.length; i++) {
            if (ary[i]!=0){
                bw.write(ary[i]+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}