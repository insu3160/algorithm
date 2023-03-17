import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int sum ;
    static int S;
    static int c=0;
    private static void com(long[] ary, boolean[] used, int index, int i) {
        if (i==0){
            sum=0;
            for (int j = 0; j < ary.length; j++) {
                if (used[j]==true){
                    sum+=ary[j];

                }
            }
            if (sum==S){
                c++;
            }
            return;
        }
        if (index==ary.length){
            return;
        }
        else {
            used[index]=true;
            com(ary,used,index+1,i-1);
            used[index]=false;
            com(ary,used,index+1,i);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] ary = new long[N];
        boolean[] used = new boolean[N];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            ary[i] = num;
        }
        for (int i = 1; i <= N; i++) {
            com(ary,used,0,i);
        }
        bw.write(c+"");
        bw.flush();
        bw.close();
    }
}
