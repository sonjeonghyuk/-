class Solution {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i <number.length; i++) {
            for (int j = 1; j < number.length; j++) {
                for (int k = 2; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0 && i < j && j < k ){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}