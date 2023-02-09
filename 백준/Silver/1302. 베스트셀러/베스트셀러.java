import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> bookList = new ArrayList<String>(n);

        List<Integer> aryList = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            String book = scanner.next();
            bookList.add(book);
        }
        for (int i = 0; i < n; i++) {
            aryList.add(0);
        }
        for (int i = 0; i < bookList.size()-1; i++) {
            for (int j = i+1; j < bookList.size(); j++) {
                if (bookList.get(i).equals(bookList.get(j))){
                    aryList.set(i,aryList.get(i)+1);
                }
            }
        }
       


        while(aryList.size()>1){
            if (aryList.get(0)>aryList.get(1)){
                aryList.remove(1);
                bookList.remove(1);
            }
            else if(aryList.get(0)==aryList.get(1)){
                if (bookList.get(0).compareTo(bookList.get(1))<0){
                    aryList.remove(1);
                    bookList.remove(1);
                }
                else {
                    aryList.remove(0);
                    bookList.remove(0);
                }
            }
            else if(aryList.get(0)<aryList.get(1)){
                aryList.remove(0);
                bookList.remove(0);
            }
        }

        System.out.print(bookList.get(0));

    }
}