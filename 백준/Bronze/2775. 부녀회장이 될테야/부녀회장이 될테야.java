import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int k; int n;
        for (int i = 0; i < t; i++) {
            k= Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            if (n==1){
                bw.write(n+"\n");
            }
            else {
                int ap[][] = new int[k+1][n];
                for (int j = 0; j < k+1; j++) {
                    for (int l = 0; l < n; l++) {
                        if(j==0){
                            ap[j][l]=l+1;
                        }
                        else if (l==0){
                            ap[j][l]=1;
                        }
                        else {
                            ap[j][l] = ap[j-1][l]+ap[j][l-1];
                        }

                    }
                }
                bw.write(ap[k][n-1]+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}