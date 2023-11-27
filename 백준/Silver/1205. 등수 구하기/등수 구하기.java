
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int scores = sc.nextInt();
        int myScore = sc.nextInt();
        int rank = sc.nextInt();
        int[] scoreNumbers = new int[scores];
        for (int i = 0; i < scores; i++) {
            scoreNumbers[i] = sc.nextInt();
        }
        Arrays.sort(scoreNumbers);
        if (rank!=scores){
            for (int i = scoreNumbers.length-1; i >= 0; i--) {
                if (myScore>=scoreNumbers[i]){
                    stack.push(myScore);
                    break;
                }
                else{
                    stack.push(scoreNumbers[i]);
                }
                if (i == 0){
                    stack.push(myScore);
                }
            }
        }
        else if(myScore <= scoreNumbers[0]){
            for (int i = scoreNumbers.length-1; i >= 0; i--) {
                stack.push(scoreNumbers[i]);
            }
            stack.push(myScore);
        }
        else{
            for (int i = scoreNumbers.length-1; i >= 0; i--) {
                if (myScore>=scoreNumbers[i]){
                    stack.push(myScore);
                    break;
                }
                else{
                    stack.push(scoreNumbers[i]);
                }
                if (i == 0){
                    stack.push(myScore);
                }
            }
        }

        if (scores == 0){
            stack.push(myScore);
        }
        if (stack.size()>rank){
            System.out.println(-1);
        }
        else {
            System.out.println(stack.size());
        }
    }
}
