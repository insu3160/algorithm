import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int x = 0;
        int y = 0;
        int result =0;
        int range = (int) Math.pow(2,N);
        while (true){
            range/=2;

            if (r<x+range && c<y+range){
                result +=(range*range*0);
            }
            else if(r<x+range && c>=y+range){
                result += (range*range*1);
                y+=range;
            }
            else if (c<y+range){
                result += (range*range*2);
                x+=range;
            }
            else{
                result += (range*range*3);
                x+=range;
                y+=range;
            }
            if (range==1){
                break;
            }

        }

        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}