import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String answer = solution(num);
        bw.write(solution(num));
    }
    public static String solution(int num) {
        String answer = "Odd";
        if (num%2==0){
            answer="Even";
        }
        return answer;
    }
}
