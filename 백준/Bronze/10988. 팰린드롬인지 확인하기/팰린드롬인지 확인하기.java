import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = String.valueOf(new StringBuilder(a).reverse());
        if (a.equals(b)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
