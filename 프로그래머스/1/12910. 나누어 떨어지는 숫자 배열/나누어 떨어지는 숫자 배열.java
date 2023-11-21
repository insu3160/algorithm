import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(", ");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        int divisor = Integer.parseInt(br.readLine());
        int[] answer = solution(intArr, divisor);
        bw.write("[");
        for (int i = 0; i < answer.length; i++) {
            if (i == answer.length-1){
                bw.write(answer[i]+"");
            }
            else {
                bw.write(answer[i] + ", ");
            }
        }
        bw.write("]");
        bw.close();
    }
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        if (list.isEmpty()){
            list.add(-1);
        }
        return list.stream()
                .sorted(Comparator.comparingInt(Integer::intValue))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}