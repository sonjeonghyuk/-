class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt = num_list.length - n + 1;
        int[] answer = new int[cnt];
        int num = 0;

        for (int i = n - 1; i < num_list.length; i++) {
            answer[num++] = num_list[i];
        }
        return answer;
    }
}