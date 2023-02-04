public class Main {
    public static void main(String[] args) {
        int ary[] = new int[100000];
        int c = 0;
        for (int i = 1; i <= 10000; i++) {
            int d = i;
            int k = i;
            if(i<10){
                d += i;
            }
            else{
                while (k > 0){
                    d += k%10;
                    k /= 10;
                }
            }
            ary[i] = d;
        }
        for (int i = 1; i < 10000; i++) {
            for (int j = 0; j < ary.length; j++) {
                if (ary[j] == i){
                    c = 0;
                    break;
                }
                else {
                    c = 1;
                }
            }
            if (c == 1){
                System.out.println(i);
            }
        }
    }
}
