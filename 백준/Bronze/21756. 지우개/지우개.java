import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> Alist = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Alist.add(i);
        }

        while (Alist.size()>1){
            for (int i = 0; i < Alist.size(); i++) {
                Alist.remove(i);
            }
        }
        System.out.print(Alist.get(0));

    }
}