class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int gob = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            gob *= num_list[i];
        }
        sum *= sum;
        answer = gob < sum ? 1 : 0;
        return answer;
    }
}