import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '='){
                if (str.charAt(i-1) == 'c' || str.charAt(i-1) == 's'){
                    count--;
                }
                else if (str.charAt(i-1) == 'z'){
                    if (i>1 && str.charAt(i-2) == 'd'){
                        count-=2;
                    }
                    else {
                        count--;
                    }
                }
            }
            else if (str.charAt(i) == '-'){
                if (str.charAt(i-1) == 'c' || str.charAt(i-1) == 'd'){
                    count--;
                }
            }
            else if (i>=1 && str.charAt(i) == 'j'){
                if (str.charAt(i-1) == 'l' || str.charAt(i-1) == 'n'){
                    count--;
                }
            }
        }
        System.out.println(str.length()+count);
    }
}
