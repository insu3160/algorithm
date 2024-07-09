class Solution {
    public long solution(String numbers) {
      
        String[] numberList= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        
        for(int i=0;i<numberList.length;i++){
            numbers = numbers.replaceAll(numberList[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;
    }
}