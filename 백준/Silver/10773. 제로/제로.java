import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0){
                stack.pop();
            }
            else{
                stack.push(a);
            }
        }
        int answer = 0;
        for (int i = 0; i < stack.size(); i++) {
            answer+=stack.get(i);
        }
        bw.write(answer+"");
        bw.flush();
        bw.close();
    }
}
