import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 0;
        int min = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            
            if (n % i == 0 && m % i == 0) {
                arrayList.add(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (max < arrayList.get(i)) {
                max = arrayList.get(i);
            }
        }

        min = m * n / max;
        
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    }
}