import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ary = new String[5];
        for (int i = 0; i < 5; i++) {
            ary[i] = sc.nextLine();
        }
        int max = Arrays.stream(ary).mapToInt(o->o.length()).max().getAsInt();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (ary[j].length()>i) {
                    System.out.print(ary[j].charAt(i));
                }
            }
        }
    }
}
