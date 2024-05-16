import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }
        int m  = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int b = Integer.parseInt(st1.nextToken());
            if (map.containsKey(b)){
                bw.write(map.get(b)+" ");
            }
            else{
                bw.write(0+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
