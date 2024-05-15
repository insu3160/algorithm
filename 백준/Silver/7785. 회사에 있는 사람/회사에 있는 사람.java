import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<String> list = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String user = st.nextToken();
            String status = st.nextToken();
            if (status.equals("enter")){
                list.add(user);
            }
            else{
                list.remove(user);
            }
        }
        List<String> list1 = new ArrayList<>(list);
        list1.sort(Comparator.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list1.get(i));
        }


    }
}
