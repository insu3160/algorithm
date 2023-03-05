import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int[] aary = new int[a];
            int[] bary = new int[b];
            int c = 0;
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < a; j++) {
                aary[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(aary);
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < b; j++) {
                int start = 0;
                int end = a-1;
                int bnum = Integer.parseInt(st.nextToken());
                while (start<=end){
                    int mid = (start+end)/2;
                    if (aary[mid]>bnum){
                        c+=end+1-mid;
                        end=mid-1;
                    }
                    else {
                        start =mid+1;
                    }
                }
            }
            bw.write(c+"\n");
        }
        bw.flush();
        bw.close();
    }
}