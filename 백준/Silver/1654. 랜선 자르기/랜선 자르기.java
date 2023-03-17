import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long sum = 0;
        int ary[] = new int[K];
        for (int i = 0; i < K; i++) {
            int length = Integer.parseInt(br.readLine());
            ary[i] = length;
            sum+=length;
        }
        long ave = (sum/N);
        long start = 0;
        long end = ave;
        long ans = 0;
        if (ave>0) {
            while (start <= end) {
                long sum2 = 0;
                long mid = (start + end) / 2;
                if (mid<1){
                    mid=1;
                }
                for (int i = 0; i < K; i++) {
                    sum2 += ary[i] / mid;
                }
                if (sum2 >= N) {
                    start = mid + 1;
                    ans = Math.max(mid, ans);
                } else {
                    if (mid > 1) {
                        end = mid - 1;
                    }
                }
            }
        }
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
}
