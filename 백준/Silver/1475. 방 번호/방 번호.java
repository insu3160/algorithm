import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] sary = s.split("");
        int[] ary = new int[10];
        for (int i = 0; i < sary.length; i++) {
            int a = Integer.parseInt(sary[i]);
            ary[a]++;
        }
        int sn = ary[6] + ary[9];
        ary[6] = -1;
        ary[9] = -1;
        if (sn % 2 == 0){
            sn /= 2;
        }
        else{
            sn += 1;
            sn /= 2;
        }
        int max = Arrays.stream(ary).max().getAsInt();
        if (max < sn){
            max = sn;
        }
        System.out.println(max);
    }
}
