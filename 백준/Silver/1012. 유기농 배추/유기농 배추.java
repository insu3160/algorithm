import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int m;
    static int n;

    static int[][] field;
    private static void unCheck(int j, int l, int[][] field) {
        if (l==n-1 && j==m-1){
            if (field[j][l]==1){
                field[j][l]=0;
                lCheck(j,l-1,field);
            }

        }
        else if (l==0&&j==m-1){
            if (field[j][l]==1){
                field[j][l]=0;
                rCheck(j,l+1,field);
            }
        }
        else if (l>n-1||j>m-1||l<0||j<0){
            return;
        }
        else if (l==0){
            if (field[j][l]==1){
                field[j][l]=0;
                unCheck(j+1,l,field);
                rCheck(j,l+1,field);
            }

        }
        else if (j==m-1){
            if (field[j][l]==1){
                field[j][l]=0;
                lCheck(j,l-1,field);
                rCheck(j,l+1,field);
            }
        }
        else if (l==n-1){
            if (field[j][l]==1){
                field[j][l]=0;
                lCheck(j,l-1,field);
                unCheck(j+1,l,field);
            }

        }
        else{
            if (field[j][l]==1){
                field[j][l]=0;
                rCheck(j,l+1,field);
                unCheck(j+1,l,field);
                lCheck(j,l-1,field);
            }

        }

    }

    private static void lCheck(int j, int l, int[][] field) {
        if (l==n-1 && j==m-1){
            if (field[j][l]==1){
                field[j][l]=0;
                lCheck(j,l-1,field);
                upCheck(j-1,l,field);
            }

        }
        else if (l>n-1||j>m-1||l<0||j<0){
            return;
        }
        else if (j==m-1&&l==0){
            if (field[j][l]==1){
                field[j][l]=0;
                upCheck(j-1,l,field);
            }

        }
        else if(l==0){
            if (field[j][l]==1){
                field[j][l]=0;
                unCheck(j+1,l,field);
                upCheck(j-1,l,field);
            }

        }
        else {
            if (field[j][l]==1){
                field[j][l]=0;
                unCheck(j+1,l,field);
                lCheck(j,l-1,field);
                upCheck(j-1,l,field);
            }

        }

    }

    private static void upCheck(int j, int l, int[][] field) {
        if (l>n-1||j>m-1||l<0||j<0){
            return;
        }
        else if (j==0&&l==0){
            if (field[j][l]==1){
                field[j][l]=0;
                rCheck(j,l+1,field);
            }
        }
        else if (l==0){
            if (field[j][l]==1){
                field[j][l]=0;
                rCheck(j,l+1,field);
                upCheck(j-1,l,field);
            }
        }
        else if (j==0){
            if (field[j][l]==1){
                field[j][l]=0;
                rCheck(j,l+1,field);
                lCheck(j,l-1,field);
            }
        }
        else if (j==0&&l==n-1){
            if (field[j][l]==1){
                field[j][l]=0;
                lCheck(j,l-1,field);
            }
        }
        else if (l==n-1){
            if (field[j][l]==1){
                field[j][l]=0;
                lCheck(j,l-1,field);
                upCheck(j-1,l,field);
            }
        }
        else {
            if (field[j][l]==1){
                field[j][l]=0;
                lCheck(j,l-1,field);
                upCheck(j-1,l,field);
                rCheck(j,l+1,field);
            }
        }
    }

    private static void rCheck(int j, int l, int[][] field) {
        if (l==n-1 && j==m-1){
            if (field[j][l]==1){
                field[j][l]=0;
                lCheck(j,l-1,field);
            }

        }
        else if (l>n-1||j>m-1||l<0||j<0){
            return;
        }
        else if (j==m-1){
            if (field[j][l]==1){
                field[j][l]=0;
                rCheck(j,l+1,field);
                upCheck(j-1,l,field);
            }

        }
        else if (l==n-1){
            if (field[j][l]==1){
                field[j][l]=0;
                unCheck(j+1,l,field);
                upCheck(j-1,l,field);
            }

        }
        else{
            if (field[j][l]==1){
                field[j][l]=0;
                rCheck(j,l+1,field);
                unCheck(j+1,l,field);
                upCheck(j-1,l,field);
            }

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            int c= 0;
            st = new StringTokenizer(br.readLine()," ");
            m= Integer.parseInt(st.nextToken());
            n= Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            field = new int[m][n];
            for (int j = 0; j < k; j++) {
                st= new StringTokenizer(br.readLine()," ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }

            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if (field[j][l]==1){
                        c++;
                        field[j][l]=0;
                        if (l==n-1&&m==n-1){
                            return;
                        }
                        else if(l==n-1){
                            unCheck(j+1,l,field);
                        }
                        else if (j==m-1){
                            rCheck(j,l+1,field);
                        }
                        else {
                            unCheck(j+1,l,field);
                            rCheck(j,l+1,field);
                        }
                    }

                }
            }

            bw.write(c+"\n");
        }
        bw.flush();
        bw.close();
    }
}