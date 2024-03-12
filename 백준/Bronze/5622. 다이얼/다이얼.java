import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ary = sc.nextLine().toCharArray();
        int[] numary = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        int answer = 0;
        for (int i = 0; i < ary.length; i++) {
            answer += numary[ary[i]-'A'];
        }
        System.out.println(answer);
    }
}
