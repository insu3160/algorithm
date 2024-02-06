import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if(m >= 45 ){
            m -= 45;
            System.out.println(h + " "+ m);
        }
        else{
            if(h == 0){
                m+=15;
                System.out.println(23+ " "+ m);
            }
            else{
                h-=1;
                m+=15;
                System.out.println(h + " "+ m);
            }
        }
    }
}
