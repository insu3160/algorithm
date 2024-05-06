import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] ary = new String[n];
        for (int i = 0; i < n; i++) {
            ary[i] = br.readLine();
        }
        String[] sortedAry = Arrays.stream(ary)
                .distinct()
                .sorted((o1, o2) ->{
                    int lengthCompare = Integer.compare(o1.length(), o2.length());
                    if (lengthCompare == 0){
                        return o1.compareTo(o2);
                    }
                    return lengthCompare;
                }).toArray(String[]::new);

        for (int i = 0; i < sortedAry.length; i++) {
            bw.write(sortedAry[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
