class Solution {
    public int[] solution(int[] num_list) {
        int lastNum = 0;
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            lastNum = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else if (num_list[num_list.length - 1] <= num_list[num_list.length - 2]) {
            lastNum = num_list[num_list.length - 1] * 2;
        }
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = lastNum;
        return answer;
    }
}