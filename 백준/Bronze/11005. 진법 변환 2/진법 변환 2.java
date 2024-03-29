import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ary = br.readLine().split(" ");
        int N = Integer.parseInt(ary[0]);
        int B = Integer.parseInt(ary[1]);
        String answer="";
        while (true){
            int na = N%B;
            if (na>=10 && na<=35){
                answer+= (char)(na+55);
            }
            else {
                answer += na;
            }
            if (N/B == 0){
                break;
            }
            N/=B;
        }
        StringBuilder ranseer = new StringBuilder(answer).reverse();
        System.out.println(ranseer);
    }
}
