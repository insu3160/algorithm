import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b+c;
        if (d>=60){
            int hap = d/60;
            a+=hap;
            d-=hap*60;
            if (a>=24){
                a-=24;
                System.out.println(a+" "+d);
            }
            else {
                System.out.println(a+" "+d);
            }
        }
        else{
            System.out.println(a+" "+d);
        }
    }
}
