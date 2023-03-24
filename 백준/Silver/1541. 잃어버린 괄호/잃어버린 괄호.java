import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        String[] sik = new String[st.countTokens()];
        int[] result = new int[sik.length];
        for (int i = 0; i < sik.length; i++) {
            sik[i] = st.nextToken();
        }
        for (int i = 0; i < sik.length; i++) {
            StringTokenizer st1 = new StringTokenizer(sik[i],"+");
            int sum=0;
            int count = st1.countTokens();
            if (count==1){
                result[i] = Integer.parseInt(st1.nextToken());
            }
            else {
                for (int j = 0; j < count; j++) {
                    sum+= Integer.parseInt(st1.nextToken());
                }
                result[i] = sum;
            }
        }
        int resultnum = result[0];
        for (int i = 1; i < result.length; i++) {
            resultnum -= result[i];
        }
        bw.write(resultnum+"");
        bw.flush();
        bw.close();
    }
}