import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        char[] starray = st.toCharArray();

        Arrays.sort(starray);

        StringBuilder result = new StringBuilder((new String(starray)));

        result.reverse().toString();

        System.out.println(result);
    }
}