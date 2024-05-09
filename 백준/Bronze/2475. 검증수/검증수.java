import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        int sum=0;
        for (String s : str){
            int num=Integer.parseInt(s);
            sum+=num*num;
        };
        System.out.println(sum%10);
    }
}
