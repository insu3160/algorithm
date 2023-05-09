import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int ary[] = new int[N];
        int count[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            count[i] = Integer.parseInt(st.nextToken());
        }
        ary[count[0]] = 1;
        for (int i = 1; i < N; i++) {
            int index = 0;
            int a = count[i];
            while (true){
                if (ary[index] != 0){
                    index++;
                }
                else if (a > 0){
                    index++;
                    a--;
                }
                else {
                    break;
                }

            }

            ary[index] = i+1;

        }
        for (int i = 0; i < N; i++) {
            bw.write(ary[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}