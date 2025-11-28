import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        List<Robot> robotList = new ArrayList<>();
        for (int i = 0; i < routes.length; i++) {
            robotList.add(new Robot(points[routes[i][0] - 1]));
            for (int j = 1; j < routes[0].length; j++) {
                robotList.get(i).move(points[routes[i][j]-1]);
            }
        }
        int maxLen = 0;
        for (Robot r : robotList){
            maxLen = Math.max(maxLen, r.path.size());
        }
        for (int i = 0; i < maxLen; i++) {
            Map<String, Integer> count = new HashMap<>();

            for (Robot r : robotList){
                int[] pos = r.getPosition(i);
                if (pos == null){
                    continue;
                }
                String key = pos[0] +","+pos[1];
                count.put(key, count.getOrDefault(key, 0)+1);
            }

            for (int c : count.values()){
                if (c>=2){
                    answer++;
                }
            }
        }
        return answer;
    }

}
class Robot {
    int x;
    int y;
    List<int[]> path = new ArrayList<>();
    public Robot(int[] points){
        this.x = points[0];
        this.y = points[1];
        path.add(new int[]{x,y});
    }
    public void move(int[] points){
        int destX = points[0];
        int destY = points[1];
        // X 좌표 먼저 이동
        while (x != destX) {
            if (x < destX) {
                x++;
            }
            else {
                x--;
            }
            path.add(new int[]{x, y});
        }

        // Y 좌표 이동
        while (y != destY) {
            if (y < destY) {
                y++;
            }
            else {
                y--;
            }
            path.add(new int[]{x, y});
        }
    }
    public int[] getPosition(int t){
        if (t < path.size()){
            return path.get(t);
        }
        return null;
    }

}