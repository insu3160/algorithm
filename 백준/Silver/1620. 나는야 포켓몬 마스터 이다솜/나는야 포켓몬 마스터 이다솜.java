import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();
        Map<Integer,String> numMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            map.put(s,i+1);
            numMap.put(i+1,s);
        }
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            if (s.charAt(0)>= 49 && s.charAt(0)<=57){
                bw.write(numMap.get(Integer.parseInt(s))+"\n");
            }
            else{
                bw.write(map.get(s)+"\n");
            }
        }
        bw.flush();
        bw.close();

    }
}
