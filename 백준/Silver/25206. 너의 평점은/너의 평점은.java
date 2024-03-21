import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double count = 0;

        for (int i = 0; i < 20; i++) {
            sc.next();
            double hak = sc.nextDouble();
            String rank = sc.next();
            count += hak;
            if (rank.equals("A+")){
                total += hak*4.5;
            }
            else if (rank.equals("A0")){
                total += hak*4.0;
            }
            else if (rank.equals("B+")){
                total += hak*3.5;
            }
            else if (rank.equals("B0")){
                total += hak*3.0;
            }
            else if (rank.equals("C+")){
                total += hak*2.5;
            }
            else if (rank.equals("C0")){
                total += hak*2.0;
            }
            else if (rank.equals("D+")){
                total += hak*1.5;
            }
            else if (rank.equals("D0")){
                total += hak*1.0;
            }
            else if (rank.equals("F")){
                total += hak*0;
            }
            else {
                count-=hak;
            }
           
        }
        System.out.println(total/count);
    }
}
