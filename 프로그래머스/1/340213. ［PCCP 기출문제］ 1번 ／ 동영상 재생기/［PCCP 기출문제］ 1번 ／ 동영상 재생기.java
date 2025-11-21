class Solution {
        public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
            int video = toSec(video_len);
            int now = toSec(pos);
            int ops = toSec(op_start);
            int ope = toSec(op_end);
            if (now >= ops && now <= ope){
                now = ope;
            }
            for (String cmd : commands){
                if (cmd.equals("next")){
                    now+=10;
                }
                else{
                    now-=10;
                }
            
                now = Math.max(0, Math.min(now, video));
                if (now >= ops && now <= ope){
                    now = ope;
                }
            }
            now = Math.max(0, Math.min(now, video));
            return String.format("%02d:%02d", now/60, now%60);
        }
        public static int toSec(String time){
            String[] sec = time.split(":");
            return Integer.parseInt(sec[0]) * 60 + Integer.parseInt(sec[1]);
        }
    }