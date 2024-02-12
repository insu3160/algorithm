import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        String[] str = new String[2];
        int answer;
        for (int i = 0; i < a; i++) {
            str = br.readLine().split(" ");
            answer = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
            bw.write(answer+"\n");
        }
        bw.flush();
        bw.close();
    }
}
