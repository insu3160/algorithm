import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] sang = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int m = Integer.parseInt(br.readLine());
        int[] ary = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            answer[i] = binarySearch1(sang, ary[i]);
        }
        for (int i = 0; i < m; i++) {
            bw.write(answer[i]+" ");
        }
        bw.flush();
        bw.close();

    }

    private static int binarySearch1(int[] sang, int key) {
        int low = 0;
        int high = sang.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (sang[mid] == key){
                return 1;
            }else if (sang[mid]>key){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return 0;
    }
}
