import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        for (int i = 0; i < n; i++) {
            int a= sc.nextInt();
            if (a == 1){
                count--;
                continue;
            }
            else{
                for (int j = 2; j < a; j++) {
                    if (a % j ==0){
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
