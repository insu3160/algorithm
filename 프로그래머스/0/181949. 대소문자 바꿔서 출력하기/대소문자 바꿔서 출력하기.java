import java.util.Scanner;

public class Solution {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            for (int i = 0; i < a.length(); i++) {
                int c = (int)a.charAt(i);
                if (c>=65 && c<=90){
                    System.out.print((char)(c+32));
                }
                else{
                    System.out.print((char)(c-32));
                }
            }
        }
}