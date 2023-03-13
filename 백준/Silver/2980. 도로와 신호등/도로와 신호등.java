import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int SL[] = new int[N];
        int RL[] = new int[N];
        int GL[] = new int[N];
        int t=0;
        int d=0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int D = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            SL[i] = D;
            RL[i] = R;
            GL[i] = G;
        }
        int i=0;

        while (d<L){

            if (SL[i]==d){
                if (((t%(RL[i]+GL[i]))-RL[i]<0)){
                    d--;
                }
            }
            t++;
            d++;
            if (SL[i]<d){
                if (i!=SL.length-1){
                    i++;
                }
            }

        }
        bw.write(t+"");
        bw.flush();
        bw.close();
    }
}