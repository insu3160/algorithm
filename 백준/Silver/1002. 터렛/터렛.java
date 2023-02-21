import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double dis; double x; double y;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int[] ary = new int[st.countTokens()];
            for (int j = 0; j < ary.length; j++) {
                ary[j] = Integer.parseInt(st.nextToken());
            }
            if (ary[0] == ary[3] && ary[1]==ary[4] && ary[2] == ary[5]){
                bw.write("-1");
                bw.write("\n");
            }
            else if(ary[0] == ary[3] && ary[1]==ary[4] && ary[2] != ary[5]){
                bw.write("0");
                bw.write("\n");
            }
            else {
                x = ary[0]-ary[3];
                y = ary[1]-ary[4];
                dis = Math.sqrt((x*x)+(y*y));
                if (dis == ary[2]+ary[5]){
                    bw.write("1");
                    bw.write("\n");
                }
                else if (dis<ary[2]+ary[5]){
                    int max = Math.max(ary[2],ary[5]);
                    int min = Math.min(ary[2],ary[5]);
                    if (max-min==dis){
                        bw.write("1");
                        bw.write("\n");
                    }
                    else if (max-min>dis){
                        bw.write("0");
                        bw.write("\n");
                    }
                    else {
                        bw.write("2");
                        bw.write("\n");
                    }
                }
                else if (dis>ary[2]+ary[5]){
                    bw.write("0");
                    bw.write("\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
