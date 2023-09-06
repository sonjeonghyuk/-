import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[5];

        for (int item : num_list) {
            list.add(item);
        }

        Collections.sort(list);
        

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}