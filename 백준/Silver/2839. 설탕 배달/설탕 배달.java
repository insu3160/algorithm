import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int basket = 0;
        int copyn = n;
        while (copyn != 0){
            if (copyn%10 == 0 || copyn %10 == 5){
                copyn-=5;
                basket++;
            }
            else {
                copyn-=3;
                basket++;
            }
            if (copyn<0){
                basket = -1;
                break;
            }

        }
        System.out.println(basket);
    }
}