public class Main {
    public static void main(String[] args) {
        int ary[] = new int[20000];
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
            ary[d] = 1;
        }
        for (int i = 1; i < 10000; i++) {
            if (ary[i] == 0){
                System.out.println(i);
            }
        }
    }
}