import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int ary[] = new int[]{64, 32, 16, 8, 4, 2, 1};
        int result = 0;
        int c = 1;
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == X) {
                c = 1;
                break;
            } else if (ary[i] < X) {
                result = ary[i];
                for (int j = 1; j < ary.length - i; j++) {
                    result += ary[i + j];
                    c++;
                    if (result > X) {
                        result -= ary[i + j];
                        c--;
                    }
                    else if (result == X) {
                        break;
                    }
                }
                break;
            }

        }
        System.out.println(c);
    }
}
