import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.next();
        int n = sc.nextInt();
        int[] ary = new int[B.length()];
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) >= 'A' && B.charAt(i) <= 'Z'){
                ary[i] = B.charAt(i)-55;
            }
            else {
                ary[i] = B.charAt(i)-48;
            }
        }
        long answer = 0;
        for (int i = 0; i < ary.length; i++) {
            answer += (long) (ary[i] * Math.pow(n, (ary.length - 1) - i));
        }
        System.out.println(answer);
    }
}
