import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long resert = sc.nextLong();
        int n = sc.nextInt();
        int price;
        int count;
        long answer=0;
        for (int i = 0; i < n; i++) {
            price= sc.nextInt();
            count = sc.nextInt();
            answer += price*count;
        }
        if (answer == resert){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
