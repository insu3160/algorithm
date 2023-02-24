import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st =new StringTokenizer(br.readLine()," ");
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] block = new int[h][w];
        boolean check;
        int c= 0;
        int rain = 0;
        int n;
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < w; i++) {
             n = Integer.parseInt(st.nextToken());
            for (int j = h-1; j > h-n-1; j--) {
                block[j][i] = 1;
            }
        }
        for (int i = h-1; i >= 0; i--) {
            check = false;
            for (int j = 0; j < w; j++) {
                if (block[i][j]==1 && !check){
                    c=j;
                    check = true;
                }
                else if (block[i][j]==1 && check){
                    rain += j-c-1;
                    c=j;
                }
            }
        }
        System.out.println(rain);
    }
}