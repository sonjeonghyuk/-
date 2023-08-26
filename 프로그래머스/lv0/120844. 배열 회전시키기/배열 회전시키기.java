import java.util.Arrays;
import java.util.LinkedList;
class Solution {
    public int[] solution(int[] numbers, String direction) {
         LinkedList<Integer> list = new LinkedList<>();

        for (int number : numbers) {
            list.add(number);
        }


        if (direction.equals("right")) {
            list.addFirst(list.getLast());
            list.removeLast();
        } else if (direction.equals("left")) {
            list.addLast(list.getFirst());
            list.removeFirst();
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}