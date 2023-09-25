import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solution(number,n,m));
    }

    static int solution(int number, int n, int m) {
        int answer = 0;
        if (number%n==0 && number%m==0){
            answer=1;
        }
        return answer;
    }
}
