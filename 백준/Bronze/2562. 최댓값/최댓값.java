import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> iList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            iList.add(sc.nextInt());
        }
        int max = iList.stream().mapToInt(x -> x).max().getAsInt();
        System.out.println(max);
        System.out.println(iList.indexOf(max)+1);
    }
}
