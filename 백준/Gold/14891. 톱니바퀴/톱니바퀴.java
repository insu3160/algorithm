import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] first;
    static int[] second;
    static int[] third ;
    static int[] fourth ;
    private static void rotation2(int[] arr) {
        int temp=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[7]=temp;
    }

    private static void rotation1(int[] arr) {
        int temp=arr[7];
        for (int i = arr.length-2; i >=0; i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        first = new int[8];
        second = new int[8];
        third = new int[8];
        fourth = new int[8];
        String st = br.readLine();
        for (int i = 0; i < 8; i++) {
            first[i]=st.charAt(i)-48;
        }
        st = br.readLine();
        for (int i = 0; i < 8; i++) {
            second[i]=st.charAt(i)-48;
        }
        st = br.readLine();
        for (int i = 0; i < 8; i++) {
            third[i]=st.charAt(i)-48;
        }
        st = br.readLine();
        for (int i = 0; i < 8; i++) {
            fourth[i]=st.charAt(i)-48;
        }
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st1;
        for (int i = 0; i < k; i++) {
            st1 = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st1.nextToken());
            int bec = Integer.parseInt(st1.nextToken());
            if(num==1){
                if (bec==1){
                    rotation1(first);
                    if (first[3]!=second[6]){
                        rotation2(second);
                        if (second[1]!=third[6]){
                            rotation1(third);
                            if (third[3]!=fourth[6]){
                                rotation2(fourth);
                            }
                        }
                    }
                }
                else if(bec==-1){
                    rotation2(first);
                    if (first[1]!=second[6]){
                        rotation1(second);
                        if (second[3]!=third[6]){
                            rotation2(third);
                            if (third[1]!=fourth[6]){
                                rotation1(fourth);
                            }
                        }
                    }
                }
            }
            else if (num==2){
                if (bec==1){
                    rotation1(second);
                    if (second[3]!=third[6]){
                        rotation2(third);
                        if (third[1] != fourth[6]){
                            rotation1(fourth);
                        }
                    }
                    if (second[7]!=first[2]){
                        rotation2(first);
                    }
                }
                else if (bec==-1){
                    rotation2(second);
                    if (second[1]!=third[6]){
                        rotation1(third);
                        if (third[3] != fourth[6]){
                            rotation2(fourth);
                        }
                    }
                    if (second[5]!=first[2]){
                        rotation1(first);
                    }
                }
            }
            else if (num==3){
                if (bec==1){
                    rotation1(third);
                    if (third[7]!=second[2]){
                        rotation2(second);
                        if (second[5] != first[2]){
                            rotation1(first);
                        }
                    }
                    if (third[3]!=fourth[6]){
                        rotation2(fourth);
                    }
                }
                else if (bec==-1){
                    rotation2(third);
                    if (!(third[5] == second[2])){
                        rotation1(second);
                        if (second[7] != first[2]){
                            rotation2(first);
                        }
                    }
                    if (third[1]!=fourth[6]){
                        rotation1(fourth);
                    }
                }
            }
            else if (num==4){
                if (bec==1){
                    rotation1(fourth);
                    if (fourth[7]!=third[2]){
                        rotation2(third);
                        if (second[2]!=third[5]){
                            rotation1(second);
                            if (second[7]!=first[2]){
                                rotation2(first);
                            }
                        }
                    }
                }
                else if (bec==-1){
                    rotation2(fourth);
                    if (fourth[5]!=third[2]){
                        rotation1(third);
                        if (second[2]!=third[7]){
                            rotation2(second);
                            if (second[5]!=first[2]){
                                rotation1(first);
                            }
                        }
                    }
                }
            }
        }
        int sum=0;
        if (first[0]==1){
            sum+=1;
        }
        if (second[0]==1){
            sum+=2;
        }
        if (third[0]==1){
            sum+=4;
        }
        if (fourth[0]==1){
            sum+=8;
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }

    
}