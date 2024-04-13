import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = Math.max(a,b);
            int rmax = Math.max(max,c);
            if (rmax < a+b+c-rmax) {
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || a == c || b == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
            else{
                if (a == b && b == c && a==0){
                    break;
                }
                System.out.println("Invalid");
            }
        }
    }
}
