import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder top[];
    private static void rotation2(StringBuilder stringBuilder) {
        String temp = String.valueOf(stringBuilder.charAt(0));
        for (int i = 0; i < stringBuilder.length()-1; i++) {
            stringBuilder.replace(i,i+1, String.valueOf(stringBuilder.charAt(i+1)));
        }
        stringBuilder.replace(7,8,temp);
    }

    private static void rotation1(StringBuilder stringBuilder) {
        String temp = String.valueOf(stringBuilder.charAt(7));
        for (int i = stringBuilder.length()-1; i > 0; i--) {
            stringBuilder.replace(i,i+1, String.valueOf(stringBuilder.charAt(i-1)));
        }
        stringBuilder.replace(0,1,temp);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        top = new StringBuilder[T];
        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder(br.readLine());
            top[i] = sb;
        }
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st1;
        for (int i = 0; i < K; i++) {
            st1 = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st1.nextToken());
            int bec = Integer.parseInt(st1.nextToken());
            int f = 0;
            int b = 0;
            if (bec == 1){
                if (num==1){
                    for (int j = 0; j < T-1; j++) {
                        if (top[j].charAt(2) != top[j+1].charAt(6)){
                            f++;
                        }
                        else {
                            break;
                        }
                    }
                    for (int j = num-1; j <= f; j++) {
                        if (j%2==0){
                            rotation1(top[j]);
                        }
                        else {
                            rotation2(top[j]);
                        }
                    }
                }
                else if (num==T){
                    for (int j = num-1; j > 0 ; j--) {
                        if (top[j].charAt(6) != top[j-1].charAt(2)){
                            b++;
                        }
                        else {
                            break;
                        }
                    }
                    for (int j = num-1; j >= num-1-b; j--) {
                        if ((num-1)%2==0){
                            if (j%2==0){
                                rotation1(top[j]);
                            }
                            else {
                                rotation2(top[j]);
                            }
                        }
                        else {
                            if (j%2==1){
                                rotation1(top[j]);
                            }
                            else {
                                rotation2(top[j]);
                            }
                        }
                    }
                }
                else {
                    for (int j = num-1; j < T-1; j++) {
                        if (top[j].charAt(2) != top[j+1].charAt(6)){
                            f++;
                        }
                        else {
                            break;
                        }
                    }
                    for (int j = num-1; j > 0 ; j--) {
                        if (top[j].charAt(6) != top[j-1].charAt(2)){
                            b++;
                        }
                        else {
                            break;
                        }
                    }
                    for (int j = num-1; j <= num-1+f; j++) {
                        if ((num-1)%2==0){
                            if (j%2==0){
                                rotation1(top[j]);
                            }
                            else {
                                rotation2(top[j]);
                            }
                        }
                        else {
                            if (j%2==1){
                                rotation1(top[j]);
                            }
                            else {
                                rotation2(top[j]);
                            }
                        }
                    }
                    for (int j = num-2; j >= num-1-b; j--) {
                        if ((num-1)%2==0){
                            if (j%2==0){
                                rotation1(top[j]);
                            }
                            else {
                                rotation2(top[j]);
                            }
                        }
                        else {
                            if (j%2==1){
                                rotation1(top[j]);
                            }
                            else {
                                rotation2(top[j]);
                            }
                        }
                    }
                }
            }
            else if (bec == -1){
                if (num==1){
                    for (int j = 0; j < T-1; j++) {
                        if (top[j].charAt(2) != top[j+1].charAt(6)){
                            f++;
                        }
                        else {
                            break;
                        }
                    }
                    for (int j = num-1; j <= f; j++) {
                        if (j%2==0){
                            rotation2(top[j]);
                        }
                        else {
                            rotation1(top[j]);
                        }
                    }
                }
                else if (num==T){
                    for (int j = num-1; j > 0 ; j--) {
                        if (top[j].charAt(6) != top[j-1].charAt(2)){
                            f++;
                        }
                        else {
                            break;
                        }
                    }
                    for (int j = num-1; j >= num-1-f; j--) {
                        if ((num - 1) % 2 == 0) {
                            if (j % 2 == 0) {
                                rotation2(top[j]);
                            } else {
                                rotation1(top[j]);
                            }
                        } else {
                            if (j % 2 == 1) {
                                rotation2(top[j]);
                            } else {
                                rotation1(top[j]);
                            }
                        }
                    }
                }
                else {
                    for (int j = num-1; j < T-1; j++) {
                        if (top[j].charAt(2) != top[j+1].charAt(6)){
                            f++;
                        }
                        else {
                            break;
                        }
                    }
                    for (int j = num-1; j > 0 ; j--) {
                        if (top[j].charAt(6) != top[j-1].charAt(2)){
                            b++;
                        }
                        else {
                            break;
                        }
                    }
                    for (int j = num-1; j <= num-1+f; j++) {
                        if ((num-1)%2==0){
                            if (j%2==0){
                                rotation2(top[j]);
                            }
                            else {
                                rotation1(top[j]);
                            }
                        }
                        else {
                            if (j%2==1){
                                rotation2(top[j]);
                            }
                            else {
                                rotation1(top[j]);
                            }
                        }
                    }
                    for (int j = num-2; j >= num-1-b; j--) {
                        if ((num-1)%2==0){
                            if (j%2==0){
                                rotation2(top[j]);
                            }
                            else {
                                rotation1(top[j]);
                            }
                        }
                        else {
                            if (j%2==1){
                                rotation2(top[j]);
                            }
                            else {
                                rotation1(top[j]);
                            }
                        }
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < T; i++) {
            if (top[i].charAt(0)=='1'){
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
    
}