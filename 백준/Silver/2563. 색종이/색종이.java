import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int paper[][] = new int[100][100];
        StringTokenizer st;
        int c=0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x-1; j < x+9; j++) {
                for (int k = y-1; k < y+9; k++) {
                    if (paper[j][k]==0){
                        paper[j][k]++;
                        c++;
                    }
                }
            }
        }
        bw.write(c+"");
        bw.flush();
        bw.close();
    }
}