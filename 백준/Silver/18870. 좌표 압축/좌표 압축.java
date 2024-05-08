import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];
        int[] sorted = new int[n];
        String[] num = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(num[i]);
        }
        sorted = Arrays.stream(ary).sorted().toArray();

        Map<Integer,Integer> map = new HashMap<>();
        int rank = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(sorted[i])){
                continue;
            }
                map.put(sorted[i], rank);
                rank++;
        }

        for (int i = 0; i < n; i++) {
            bw.write(map.get(ary[i])+" ");
        }
        bw.flush();
        bw.close();
    }
}
