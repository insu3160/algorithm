import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long[] ary = new long[n];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(ary);
        long m = Integer.parseInt(br.readLine());
        long start = 0;
        long end = ary[n-1];
        long ans = 0;

        while (start<=end){
            long sum=0;
            long mid = (start+end)/2;
            for (int i = 0; i < n; i++) {
                if (ary[i]>mid){
                    sum+=mid;
                }
                else {
                    sum +=ary[i];
                }
            }
            if (sum>m){
                end=mid-1;
            }
            else {
                start=mid+1;
                ans = Math.max(mid,ans);
            }
        }
        bw.write(ans+"");
        bw.flush();
        bw.close();
    }
    

}