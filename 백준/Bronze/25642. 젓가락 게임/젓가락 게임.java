import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yong = scanner.nextInt();
        int you = scanner.nextInt();
        while(yong <=4 && you <=4){
            you += yong;
            if(you <5){
                yong += you;
                if(yong >4){
                    System.out.println("yj");
                }
            }
            else {
                System.out.println("yt");
            }
        }
    }
}