import java.util.Arrays;
class Solution {
        public static int solution(int[] diffs, int[] times, long limit) {
            int max = Arrays.stream(diffs).max().getAsInt();
            int answer = max;
            int left = 1;
            int right = max;
            while (left < right) {
                int mid = (right + left) / 2;
                long time = times[0];
                for (int i = 1; i < diffs.length; i++) {
                    if (diffs[i] <= mid) {
                        time += times[i];
                    } else {
                        time += (diffs[i] - mid) * (times[i - 1] + times[i])+times[i];
                    }
                }
                if (time > limit) {
                    left = mid+1;
                } else {
                    answer = Math.min(answer, mid);
                    right = mid;
                }

            }
            return answer;
        }
    }