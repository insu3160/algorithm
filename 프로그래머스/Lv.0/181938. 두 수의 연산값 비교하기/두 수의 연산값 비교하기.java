 class Solution {
            public int solution(int a, int b) {
                int answer = 0;
                String str = String.valueOf(a)+String.valueOf(b);
                int c = 2*a*b;
                int d = Integer.parseInt(str);
                if(c>d){
                    answer = c;
                }
                else{
                    answer = d;
                }
                return answer;
            }
        }