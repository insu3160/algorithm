import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int ary[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int result=0;
        int add =0;
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
            if (ary[i]>0){
                add += ary[i];
            }
            else {
                if (add>result){
                    result = add;
                }
                if (add+ary[i]>0){
                    add+=ary[i];
                }
                else{
                    add=0;
                }
            }
        }
        if (result<add){
            result = add;
        }
        if (result==0){
            Arrays.sort(ary);
            result+=ary[n-1];
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}