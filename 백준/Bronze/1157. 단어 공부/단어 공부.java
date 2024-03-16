import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        int[] ary = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ary[s.charAt(i)-65]++;
        }
        int max = Arrays.stream(ary).max().getAsInt();
        int count = (int) Arrays.stream(ary).filter(o -> o==max).count();
        if (count != 1){
            System.out.println("?");
        }
        else{
            for (int i = 0; i < ary.length; i++) {
                if (ary[i] == max){
                    System.out.println((char)(i+65));
                    break;
                }
            }
        }
    }
}
