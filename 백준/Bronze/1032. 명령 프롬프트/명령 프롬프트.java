import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String st = br.readLine();
        String ary[] = st.split("");

        for (int i = 0; i < n-1; i++) {
            String comst = br.readLine();
            String comary[] = comst.split("");
            for (int j = 0; j < ary.length; j++) {
                if (!ary[j].equals("?") && !ary[j].equals(comary[j])){
                    ary[j] = "?";
                }
            }
        }
        for (int i = 0; i < ary.length; i++) {
            bw.write(ary[i]);
        }
        bw.flush();
        bw.close();
    }
}
