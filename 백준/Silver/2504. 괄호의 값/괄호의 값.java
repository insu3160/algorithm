import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st = br.readLine();
        char[] ch = st.toCharArray();
        Stack<Character> stack = new Stack<>();
        Stack<Character> copystack = new Stack<>();
        int mu=1;
        int result = 0;
        for (int i = 0; i < ch.length; i++) {
            char r = ch[i];
            if (r == '(' || r=='['){
                if (!stack.isEmpty() && mu==0){
                    if (stack.size()>1){
                        if (stack.peek()=='('){
                            mu=2;
                        }
                        else{
                            mu=3;
                        }
                        copystack.add(stack.pop());
                        while (!stack.isEmpty()){
                            if (stack.peek()=='('){
                                mu*=2;
                            }
                            else{
                                mu*=3;
                            }
                            copystack.add(stack.pop());
                        }
                        while(!copystack.isEmpty()){
                            stack.add(copystack.pop());
                        }
                        if (r == '(') {
                            mu *= 2;
                        } else if (r == '[') {
                            mu *= 3;
                        }
                    }
                    else {
                        if (stack.peek() == '(') {
                            mu = 2;
                        } else {
                            mu = 3;
                        }
                        if (r == '(') {
                            mu *= 2;
                        } else if (r == '[') {
                            mu *= 3;
                        }
                    }
                    stack.push(r);
                }
                else if (stack.isEmpty()){
                    if (r == '('){
                        mu = 2;
                    }
                    else if (r == '['){
                        mu = 3;
                    }
                    stack.push(r);
                }
                else {
                    if (r == '(') {
                        mu *= 2;
                    }
                    else if (r == '[') {
                        mu *= 3;
                    }
                    stack.push(r);
                }
            }
            else{
                if (stack.isEmpty()){
                    result =0;
                    break;
                }
                if (r == ')' && stack.peek() == '('){
                    stack.pop();
                    result += mu;
                    mu=0;
                }
                else if (r == ']' && stack.peek() == '['){
                    stack.pop();
                    result += mu;
                    mu=0;
                }
                else{
                    result = 0;
                    break;
                }
            }
        }
        if(stack.isEmpty()){
            bw.write(result+"");
        }
        else {
            bw.write(0+"");
        }
        bw.flush();
        bw.close();
    }
}