import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        String[] ary = a.trim().split(" ");
        if (a.isEmpty()){
            System.out.println(0);
        }
        else {
            System.out.println(ary.length);
        }
    }
}
