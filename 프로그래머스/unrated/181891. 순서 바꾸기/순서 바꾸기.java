import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt = 0;
        int[] answer = new int[num_list.length];

        for (int i = n; i < answer.length; i++) {
            answer[cnt++] = num_list[i];
        }

        for (int i = 0; i < n; i++) {
            answer[cnt++] = num_list[i];
        }
        return answer;
    }
}