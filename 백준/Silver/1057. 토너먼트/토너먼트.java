import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int im = Integer.parseInt(st.nextToken());
        int round = 0;
        List<Integer> to = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            to.add(i);
        }

        if (kim>im){
            int temp = kim;
            kim = im;
            im = temp;
        }

        while (to.contains(kim) && to.contains(im)){
            for (int i = 1; i < to.size(); i++) {
                if (to.get(i)==kim || to.get(i)==im){
                    to.remove(i-1);
                }
                else {
                    to.remove(i);
                }

            }
            round++;
        }


        System.out.print(round);

    }
}
