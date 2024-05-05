import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int[][] ary = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j >= 0; j--) {
                ary[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(ary, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        for (int i = 0; i < n; i++) {
            for (int j = 1; j >= 0; j--) {
                bw.write(ary[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
