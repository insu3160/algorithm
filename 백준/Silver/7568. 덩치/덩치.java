import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int height[] = new int[n];
        int weight[] = new int[n];
        int result[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            height[i] = x;
            weight[i] = y;
        }
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (i!=j){
                    if (height[i] < height[j] && weight[i] < weight[j]){
                        c++;
                    }
                }
                result[i] = c;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print((result[i]+1)+" ");
        }
    }
}
