import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = 0;
        long answer = 0;
        for (int i = 1; i < n-1; i++) {
            c+=i;
            answer+=c;

        }
        System.out.println(answer);
        System.out.println(3);

    }
}
