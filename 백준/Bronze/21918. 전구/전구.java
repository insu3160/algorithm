import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] bulb = new int[N];
        int p;
        for(int i = 0; i < bulb.length; i++){
            do {
                p = scanner.nextInt();
                bulb[i] = p;
            }while (p > 1 || p < 0);
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a == 1){
                bulb[b-1] = c;
            }
            else if (a == 2){
                for (int j = b-1; j < c; j++) {
                    if (bulb[j] == 1){
                        bulb[j] = 0;
                    }
                    else if(bulb[j] == 0){
                        bulb[j] = 1;
                    }
                }
            }
            else if(a== 3){
                for (int j = b-1; j < c; j++) {
                    if (bulb[j] !=0){
                        bulb[j] = 0;
                    }
                }
            }
            else {
                for (int j = b-1; j < c; j++) {
                    if(bulb[j] != 1){
                        bulb[j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < bulb.length; i++) {
            System.out.print(bulb[i] + " ");
        }
    }
}