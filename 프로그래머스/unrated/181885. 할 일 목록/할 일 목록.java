class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
         int cnt = 0;

        for (boolean item : finished) {
            if (item == false) {
                cnt++;
            }
        }
        String[] answer = new String[cnt];

        int t = 0;
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                answer[t++] = todo_list[i];
            }
        }
        return answer;
    }
}