 class Solution {
        public static int solution(int n, int w, int num) {
            int answer = 0;
            int h = n % w == 0 ? n/w : n/w+1;
            int[][] boxAry = new int[h][w];
            for (int i = 0; i < h; i++) {
                int boxNum = w*i+1;
                if (i%2 == 0){
                    for (int j = 0; j < w; j++) {
                        boxAry[i][j] = boxNum;
                        boxNum++;
                        if (boxNum>n){
                            break;
                        }
                    }
                }
                else{
                    for (int j = w-1; j >= 0 ; j--) {
                        boxAry[i][j] = boxNum;
                        boxNum++;
                        if (boxNum>n){
                            break;
                        }
                    }
                }
            }
            int boxh = num % w == 0 ? num/w-1 : num/w;
            int boxw = 0;
            for (int i = 0; i < w; i++) {
                if (boxAry[boxh][i] == num){
                    boxw = i;
                    break;
                }
            }
            for (int i = boxh; i < h; i++) {
                if (boxAry[i][boxw] != 0){
                    answer++;
                }
            }

            return answer;
        }
 }