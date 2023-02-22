import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int time = 0;
        ArrayList<Integer> truck = new ArrayList<>();
        ArrayList<Integer> ing = new ArrayList<>();



        st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < n; i++) {
            truck.add(Integer.parseInt(st.nextToken()));
        }

        while (truck.size() !=0 || sum(ing)!=0){
            if (ing.size()<w && truck.size()!=0){
                if (sum(ing)+truck.get(0)<=l) {
                    ing.add(truck.remove(0));
                    time++;
                }
                else {
                    ing.add(0);
                    time++;
                }
            }
            else if(ing.size() == w && truck.size()!=0){
                ing.remove(0);
                if (sum(ing)+truck.get(0)<=l){

                    ing.add(truck.remove(0));
                    time++;
                }
                else {

                    ing.add(0);
                    time++;
                }
            }
            else if(truck.size()==0){
                if (ing.size()<w) {
                    ing.add(0);
                    time++;
                }
                else if(ing.size()==w){
                    ing.remove(0);
                    ing.add(0);
                    time++;
                }
            }
            
        }
        System.out.println(time);


    }
}