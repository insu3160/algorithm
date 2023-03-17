import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        Stack<Character> re = new Stack<>();
        String main = br.readLine();
        for (int i = 0; i < main.length(); i++) {
            stack.push(main.charAt(i));
        }
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String ad = br.readLine();
            char copyad = ad.charAt(0);
            switch (copyad){
                case 'L':
                    if (!stack.isEmpty()){
                        re.push(stack.pop());
                    }
                    break;
                case 'D':
                    if (!re.isEmpty()){
                        stack.push(re.pop());
                    }
                    break;
                case 'B':
                    if (!stack.isEmpty()){
                        stack.pop();
                    }
                    break;
                case 'P':
                    char adad = ad.charAt(2);
                    stack.push(adad);
                    break;
                default:
                    break;
            }
        }
        while (!stack.isEmpty()){
            re.push(stack.pop());
        }
        while (!re.isEmpty()){
            bw.write(re.pop());
        }
        bw.flush();
        bw.close();
    }
}