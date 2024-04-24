import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());
        int max = 0;
        for (int i = 0; i < list.size()-2; i++) {
            for (int j = i+1; j < list.size()-1; j++) {
                for (int k = j+1; k < list.size(); k++) {
                    int sum = list.get(i)+list.get(j)+list.get(k);
                    if (sum<=m){
                        if (max <= sum){
                            max = sum;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
