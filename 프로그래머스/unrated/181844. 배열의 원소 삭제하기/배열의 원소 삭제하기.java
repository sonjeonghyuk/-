import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int item : arr) {
            list.add(item);
        }

        for (int item : delete_list) {
            if (list.contains(item)) {
                list.remove(Integer.valueOf(item));
            }
        }
        
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}