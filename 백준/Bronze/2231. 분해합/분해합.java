import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = false;
        for (int i = 1; i < n; i++) {
            String[] ary = String.valueOf(i).split("");
            int sum = i;
            for (int j = 0; j < ary.length; j++) {
                sum += Integer.parseInt(ary[j]);
            }
            if (sum==n){
                System.out.println(i);
                a=true;
                break;
            }
        }
        if (!a){
            System.out.println(0);
        }
    }
}
