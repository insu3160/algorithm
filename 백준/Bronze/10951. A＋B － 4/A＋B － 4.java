import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            if (str == null) {
                break;
            }
            String[] strary = str.split(" ");
            if (strary.length != 2) {
                break;
            }
            int result = Integer.parseInt(strary[0]) + Integer.parseInt(strary[1]);
            bw.write(result + "\n");
            bw.flush();
        }
        bw.close();
    }
}
