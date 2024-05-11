import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] ary = new char[n][m];
        for (int i = 0; i < n; i++) {
            String st= sc.next();
            for (int j = 0; j < m; j++) {
                ary[i][j] = st.charAt(j);
            }
        }
        int min = 32;
        for (int i = 0; i < n-7; i++) {
            for (int j = 0; j < m-7; j++) {
                int cw = 0;
                int cb = 0;
                for (int k = i; k < i+8; k++) {
                    for (int l = j; l < j+8; l++) {
                        if ((((k-i)+(l-j))%2) == 0){
                            if (ary[k][l] == 'W'){
                                cb++;
                            }
                            else{
                                cw++;
                            }
                        }
                        else{
                            if (ary[k][l] == 'W'){
                                cw++;
                            }
                            else{
                                cb++;
                            }
                        }
                    }
                }
                if (cw>cb){
                    if (min>cb){
                        min=cb;
                    }
                }
                else{
                    if (min>cw){
                        min=cw;
                    }
                }
            }
        }
        System.out.println(min);
    }
}
