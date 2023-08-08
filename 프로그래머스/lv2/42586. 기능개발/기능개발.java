import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] date = new int[speeds.length];
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < progresses.length; i++) {
                while(progresses[i] < 100) {
                    progresses[i] += speeds[i];
                    count++;
                }
                if (progresses[i] >= 100) date[i] = count;
                count = 0;
        }
        
        int x = date[0];
        int count1 = 1;
        for (int i = 1; i < progresses.length; i++) {

            if (x >= date[i]) {
                count1++;
            } else {
                list.add(count1);
                count1 = 1;
                x = date[i];
            }
        }
        list.add(count1);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}