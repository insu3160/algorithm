import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    static int cnt=0;
    private static int Basket(int n) {
        if (n<0){
            return -1;
        } else if (n==0) {
            return cnt;
        } else {
            if (n % 5 == 0) {
                cnt += n / 5;
                return cnt;
            } else {
                cnt++;
                return Basket(n - 3);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int basket = 0;
        int result = Basket(n);
        System.out.println(result);
    }



}