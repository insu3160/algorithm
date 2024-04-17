import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            List<Long> list = new ArrayList<>();
            String[] as = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                list.add(Long.parseLong(as[j]));
            }
            list = list.stream().sorted().collect(Collectors.toList());
            long min = list.get(k-1) - list.get(0);;
            for (int j = 0; j < list.size()-k+1; j++) {
                long nmin = list.get(j+k-1) - list.get(j);
                if (min > nmin){
                    min = nmin;
                }
            }
            bw.write("#"+(i+1)+" "+min+"\n");
        }
        bw.flush();
        bw.close();
    }
}
