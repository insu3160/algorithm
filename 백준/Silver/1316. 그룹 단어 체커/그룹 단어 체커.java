import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strary = new String[n];
        for (int i = 0; i < n; i++) {
            strary[i] = sc.next();
        }
        int count = n;
        for (int i = 0; i < strary.length; i++) {
            int[] alpha = new int[26];
            for (int j = 0; j < strary[i].length(); j++) {
                if (j == 0) {
                    alpha[(strary[i].charAt(j)-97)]++;
                }
                else {
                    if (alpha[(strary[i].charAt(j) - 97)] != 0 && strary[i].charAt(j) != strary[i].charAt(j - 1)) {
                        count--;
                        break;
                    } else {
                        alpha[(strary[i].charAt(j) - 97)]++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
