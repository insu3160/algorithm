import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String answer = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)>=97 && a.charAt(i)<=122){
                answer += (char)(a.charAt(i)-32);
            }
            else{
                answer += (char)(a.charAt(i)+32);
            }
        }
        System.out.println(answer);
    }
}
