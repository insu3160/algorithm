import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] balloon = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            balloon[i] = Integer.parseInt(st.nextToken());
        }
        int[] result = new int[n];
        result[0]=1;
        for (int i = 1; i < n; i++) {
            int c = balloon[result[i - 1] - 1];
            balloon[result[i - 1] - 1]=0;
            result[i] = result[i-1];
            if (c>0){
                for (int j = 0; j < c; j++) {
                    result[i]+=1;
                    while (true){
                        if (balloon[(result[i]-1)%n]==0){
                            result[i]+=1;
                        }
                        else {
                            break;
                        }
                    }
                }
            }
            else {
                for (int j = 0; j > c ; j--) {
                    result[i]-=1;
                    while (true){
                        if (result[i]>0){
                            if (balloon[(result[i]-1)%n]==0){
                                result[i]-=1;
                            }
                            else {
                                break;
                            }
                        }
                        else if (result[i]<=0){
                            if (balloon[(n + (result[i] % n))-1] == 0) {
                                result[i]-=1;
                            }
                            else {
                                break;
                            }
                        }

                    }
                }
            }
            if (result[i]%n==0){
                result[i]=n;
            }
            else if (result[i]%n >0){
                result[i]%=n;
            }
            else {
                result[i] = n+(result[i]%n);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]+" ");
        }
    }
}