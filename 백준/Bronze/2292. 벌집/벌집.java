import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n-1;
        int c = 6;
        int count = 1;
        while (num>0){
            c = 6;
            c *= count;
            count++;
            num -= c;

        }
        if (n == 1){
            System.out.println(1);
        }
        else {
            System.out.println(count);
        }
    }
}
