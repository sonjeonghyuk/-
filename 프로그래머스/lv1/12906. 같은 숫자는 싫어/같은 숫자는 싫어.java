import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int count = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                ar.add(arr[i]);
                arr[0] = arr[i];
            }
        }

        int size = 0;
        int[] answer = new int[ar.size()];
        for (int item : ar) {
            answer[size++] = item;
        }

        return answer;
    }
}