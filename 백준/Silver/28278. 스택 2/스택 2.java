import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            if (a==1){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if (a==2){
                if (stack.empty()){
                    bw.write("-1\n");
                }
                else{
                    bw.write(stack.pop()+"\n");
                }
            }else if(a==3){
                bw.write(stack.size()+"\n");
            }else if(a==4){
                if (stack.empty()){
                    bw.write("1\n");
                }
                else{
                    bw.write("0\n");
                }
            }else{
                if (stack.empty()){
                    bw.write("-1\n");
                }
                else{
                    bw.write(stack.peek()+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
