import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = new String[2];
        int answer;
        while (true){
            str = br.readLine().split(" ");
            if (str[0].equals("0") && str[1].equals("0")){
                break;
            }
            answer = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
            bw.write(answer+"\n");
        }
        bw.flush();
        bw.close();
    }
}
