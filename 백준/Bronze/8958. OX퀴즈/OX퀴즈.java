import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String ox = br.readLine();
            StringTokenizer st;
            st = new StringTokenizer(ox,"X");
            int c = 0;
            while (st.hasMoreTokens()){
                String a = st.nextToken();
                for (int j = 1; j <= a.length(); j++) {
                    c+=j;
                }
            }
            System.out.println(c);
        }
    }
}


