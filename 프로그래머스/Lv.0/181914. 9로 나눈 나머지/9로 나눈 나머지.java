class Solution {
    public int solution(String number) {
        int hap = 0;
        for (int i = 0; i < number.length(); i++) {
            hap+=Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return hap%9;
    }
}