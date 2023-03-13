import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Integer> count = new ArrayList<>();
        List<Integer> length = new ArrayList<>();
        int mr = 0;
        int mc = 0;
        int remor = 0;
        int remoc = 0;
        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine()," ");
            count.add(Integer.parseInt(st.nextToken()));
            length.add( Integer.parseInt(st.nextToken()));
            if (count.get(i) == 1 || count.get(i)==2){
                if (mr<length.get(i)){
                    mr=length.get(i);
                    remor=i;
                }
            }
            else if (count.get(i) == 3 || count.get(i)==4){
                if (mc <length.get(i)){
                    mc=length.get(i);
                    remoc=i;
                }
            }
        }
        int full = mc*mr;
        if (remor>remoc){
            count.remove(remor);
            length.remove(remor);
            count.remove(remoc);
            length.remove(remoc);

        }
        else {
            count.remove(remoc);
            length.remove(remoc);
            count.remove(remor);
            length.remove(remor);

        }
        int small = 0;
        if (count.get(0)==1){
            if (remor>remoc){
                if (remoc==1){
                    small=length.get(2)*length.get(3);
                }
                else if (remoc==3){
                    small=length.get(0)*length.get(1);
                }
                else {
                    small=length.get(1)*length.get(2);
                }
            }
            else {
                if (remoc==3){
                    small=length.get(0)*length.get(3);
                }
                else {
                    small=length.get(1)*length.get(2);
                }
            }
        }
        else if (count.get(0)==2){
            if (remor>remoc){
                if (remoc==1){
                    small=length.get(2)*length.get(3);
                }
                else if (remoc==3){
                    small=length.get(0)*length.get(1);
                }
                else {
                    small=length.get(1)*length.get(2);
                }
            }
            else {
                if (remoc==3){
                    small=length.get(0)*length.get(3);
                }
                else {
                    small=length.get(1)*length.get(2);
                }
            }
        }
        else if (count.get(0)==3){
            if (remor<remoc){
                if (remor==1){
                    small=length.get(2)*length.get(3);
                }
                else if (remor==3){
                    small=length.get(0)*length.get(1);
                }
                else {
                    small=length.get(1)*length.get(2);
                }
            }
            else {
                if (remor==3){
                    small=length.get(0)*length.get(3);
                }
                else {
                    small=length.get(1)*length.get(2);
                }
            }
        }
        else if (count.get(0)==4){
            if (remor<remoc) {
                if (remor == 1) {
                    small = length.get(2) * length.get(3);
                } else if (remor == 3) {
                    small = length.get(0) * length.get(1);
                } else {
                    small = length.get(1) * length.get(2);
                }
            }
            else {
                if (remor==3){
                    small=length.get(0)*length.get(3);
                }
                else {
                    small=length.get(1)*length.get(2);
                }
            }

        }

        int result = (full-small)*k;

        System.out.println(result);
    }
}
