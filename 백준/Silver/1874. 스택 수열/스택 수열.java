import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Boolean> bool = new Stack<Boolean>();
        int count =1;
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            while (true){
                if (k>=count){
                    stack.push(count);
                    count++;
                    bool.push(true);
                }
                else{
                    if (stack.peek()==k){
                        stack.pop();
                        bool.push(false);
                    }
                    break;
                }
            }

        }


        if (stack.empty()) {
            Stack<Boolean> result = new Stack<>();
            while (!bool.empty()) {
                result.push(bool.pop());
            }
            while (!result.empty()) {
                if (result.pop()) {
                    bw.write("+\n");
                }
                else{
                    bw.write("-\n");
                }
            }
        }
        else {

            bw.write("NO");
        }

        bw.flush();
        bw.close();
    }
}