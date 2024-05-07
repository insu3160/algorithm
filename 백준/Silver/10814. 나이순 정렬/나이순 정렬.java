import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[][] ary = new String[n][2];
        for (int i = 0; i < n; i++) {
            String[] st =br.readLine().split(" ");
            ary[i][0] = st[0];
            ary[i][1] = st[1];
        }
        Arrays.sort(ary, (o1, o2) -> Integer.parseInt(o1[0]) == Integer.parseInt(o2[0]) ? 0 : Integer.parseInt(o1[0])-Integer.parseInt(o2[0]));
        for (int i = 0; i < n; i++) {
            bw.write(ary[i][0]+" ");
            bw.write(ary[i][1]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
