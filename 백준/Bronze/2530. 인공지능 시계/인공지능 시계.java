import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int time = scanner.nextInt();
        int h2 = time/3600;
        int m2 = ((time%3600)/60);
        int s2 = (time%60);
        if (h2>=24){
            while (h2>=24){
                h2-=24;
            }
        }
        h += h2;
        m += m2;
        s += s2;
        if (s>=60){
            m+=1;
            s-=60;
        }
        if (m>=60){
            h +=1;
            m-=60;
        }
        if (h>=24){
            h-=24;
        }
        System.out.print(h+" "+m+" "+s);
    }
}