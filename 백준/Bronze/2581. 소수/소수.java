import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (i == 2){
                list.add(i);
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    break;
                }
                if (j == i-1){
                    list.add(i);
                }
            }
        }
        if (list.isEmpty()){
            System.out.println(-1);
        }
        else {
            System.out.println(list.stream().mapToInt(i -> i).sum());
            System.out.println(list.get(0));
        }
    }
}
