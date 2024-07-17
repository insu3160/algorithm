class Solution {
    public int solution(String my_string) {
        int answer = 0;
		my_string = my_string.replaceAll("[a-zA-z]", " ");
		String[] parse = my_string.split(" ");
        
		for (int i = 0; i < parse.length; i++) {
			if(!parse[i].isEmpty()) {
				answer += Integer.parseInt(parse[i].trim());
			}
		}

        return answer;
    }
}