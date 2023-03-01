import java.io.*;

public class Main {
    static int cnt=0;

    private static int isPalindrome(String s) {
        return  recursion(s, 0, s.length()-1);
    }

    private static int recursion(String s, int l, int r) {
        cnt++;
        if (l>=r){
            return 1;
        }
        else if(s.charAt(l) != s.charAt(r)){
            return 0;
        }
        else {
            return recursion(s, l+1,r-1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t ; i++) {
            String s = br.readLine();
            int a = isPalindrome(s);
            bw.write(a+" "+cnt+"\n");
            cnt = 0;
        }
        bw.flush();
        bw.close();
    }


}
