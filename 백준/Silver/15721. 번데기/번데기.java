import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int guho = scanner.nextInt();
        int ary[] = new int[10200];
        int zero = 0;
        int one = 0;
        int n = 1;
        int tum = 2;
        while (n<10000){
            ary[n++] = 1;
            ary[++n] = 1;
            n+=tum;
            for (int i = 0; i < tum; i++) {
                ary[++n] = 1;
            }
            n+=2;
            tum++;
        }
        
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == 1 && guho == 1){
                one++;
                if (one == t){
                    System.out.println(i%a);
                    break;
                }
            }
            else if (guho == 0 && ary[i]==0){
                zero++;
                if (zero == t){
                    System.out.println(i%a);
                    break;
                }
            }

        }
    }
}