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
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack();
            int c = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)=='('){
                    stack.push(s.charAt(j));
                }
                else if (s.charAt(j)==')'){
                    if (stack.empty()){
                        c=1;
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if (c==1){
                System.out.println("NO");
            }
            else if (stack.empty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
