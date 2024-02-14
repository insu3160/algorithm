import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        String[] str = new String[2];
        int answer;
        for (int i = 1; i <= a; i++) {
            str = br.readLine().split(" ");
            answer = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
            bw.write("Case #"+i+": "+str[0]+" + "+str[1]+" = " +answer+"\n");
        }
        bw.flush();
        bw.close();
    }
}
