import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int c=0;
            int[] room = new int[n];
            for (int j = 0; j < room.length; j++) {
                room[j] = 1;
            }
            for (int j = 2; j <= room.length; j++) {
                for (int k = 1; k <= 100; k++) {
                    int t = j*k;
                    if(t<= room.length){
                        if (room[t-1]==1){
                            room[t-1]=0;
                        }
                        else if(room[t-1]==0){
                            room[t-1]=1;
                        }
                    }
                }
            }

            for (int j = 0; j < room.length; j++) {
                
                if (room[j]==1){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}