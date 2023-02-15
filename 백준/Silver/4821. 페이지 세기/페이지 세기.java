import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String page;
        StringTokenizer st;
        StringTokenizer st2;
        do {
            List<Integer> checkList = new ArrayList<>();
            page = br.readLine();
            try {
                if (Integer.parseInt(page) <= 0) {
                    break;
                }
            }catch (NumberFormatException e){

            }catch (Exception e){

            }
            st = new StringTokenizer(br.readLine(),",");

            do {
                st2 = new StringTokenizer(st.nextToken(),"-");
                String a = st2.nextToken();
                if (Integer.parseInt(a)<=Integer.parseInt(page)){
                    if (st2.hasMoreTokens()){
                        String b = st2.nextToken();
                        if (Integer.parseInt(b)>Integer.parseInt(page)){
                            b=page;
                        }
                        if (Integer.parseInt(a)<=Integer.parseInt(b)){
                            for (int i = Integer.parseInt(a); i <= Integer.parseInt(b); i++) {
                                if ((!checkList.contains(i))){
                                    checkList.add(i);
                                }
                            }
                        }
                    }
                    else {
                        if(!checkList.contains(Integer.parseInt(a))){
                            checkList.add(Integer.parseInt(a));
                        }
                    }
                }

            }while (st.hasMoreTokens());
            System.out.println(checkList.size());
        }while (true);

    }
}