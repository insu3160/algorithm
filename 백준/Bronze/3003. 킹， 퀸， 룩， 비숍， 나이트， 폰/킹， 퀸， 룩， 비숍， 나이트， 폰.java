import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answer = {1,1,2,2,2,8};
        String[] ary = sc.nextLine().split(" ");
        for (int i = 0; i < ary.length; i++) {
            System.out.print(answer[i]-Integer.parseInt(ary[i])+" ");
        }
    }
}
