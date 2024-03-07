import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cary = sc.next().toCharArray();
        int [] nary = new int[26];
        for (int i = 0; i < nary.length; i++) {
            nary[i] = -1;
        }
        for (int j = 0; j < cary.length; j++) {
            for (int i = 'a'; i <='z'; i++) {
                if (cary[j] == (char) i){
                    if (nary[i%97] != -1){
                        break;
                    }
                    else {
                        nary[i%97]=j;
                    }
                }
            }
        }
        for (int i = 0; i < nary.length; i++) {
            System.out.print(nary[i]+" ");
        }
    }
}
