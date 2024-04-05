import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt()-1;
        if (x == 0){
            System.out.println("1/1");
        }
        else {
            int count = 1;
            int minus = 1;
            while (true){
                x -= minus;
                count++;
                if (x < 0){
                    x += minus;
                    count--;
                    break;
                }
                minus++;
            }
            if (count % 2 ==0){
                System.out.print(x+1);
                System.out.print("/");
                System.out.print(count-x);
            }
            else {
                System.out.print(count-x);
                System.out.print("/");
                System.out.print(x+1);
            }
        }

    }
}
