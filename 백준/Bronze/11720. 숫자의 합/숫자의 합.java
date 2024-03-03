import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ary = new String[n];
        ary = sc.next().split("");
        int hap =0;
        for (int i = 0; i < ary.length; i++) {
            hap += Integer.parseInt(ary[i]);
        }
        System.out.println(hap);
    }
}
