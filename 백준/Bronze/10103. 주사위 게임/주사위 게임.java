import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chang = 100;
        int sang = 100;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int changNum = scanner.nextInt();
            int sangNum = scanner.nextInt();
            if(changNum > sangNum){
                sang -= changNum;
            }
            else if(changNum < sangNum){
                chang -= sangNum;
            }
        }
        System.out.println(chang);
        System.out.println(sang);
    }
}
