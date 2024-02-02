import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");
        long answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += Long.parseLong(arr[i]);
        }
        bw.write(answer+"");
        bw.close();
    }
}
