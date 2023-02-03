import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();;
        int W = scanner.nextInt();

        char[][] c = new char[H][W];
        int[][] result = new int[H][W];
        String[] a = new  String[H];
        for (int i = 0; i < H; i++) {
            a[i] = scanner.next();
            for (int j = 0; j < W; j++) {
                c[i][j] = a[i].charAt(j);

            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (c[i][j] =='.' && j == 0){
                    result[i][j] = -1;
                }
                else if (c[i][j] =='c') {
                    result[i][j] = 0;
                }
                else if(c[i][j] =='.'){
                    result[i][j] = -1;
                    for (int k = 1; k <= j; k++) {
                        if (c[i][j-k]=='c'){
                            result[i][j]=k;
                            break;
                        }

                    }
                }


            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}