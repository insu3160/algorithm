import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()," ");
            int[] ary = new int[st.countTokens()];
            long result = 0;
            for (int j = 0; j < ary.length; j++) {
                ary[j] = Integer.parseInt(st.nextToken());
            }
            int max = ary[ary.length-1];
            for (int j = ary.length-2; j >= 0; j--) {
                if (ary[j]>max){
                    max = ary[j];
                }
                else{
                    result += max-ary[j];
                }
            }
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }
}
