import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length * k; i++) {
            StringBuilder sb = new StringBuilder();
            int x = i/k;
            for (int j = 0; j < picture[0].length() * k; j++) {
                int y = j/k;
                char ch = picture[x].charAt(y);
                sb.append(ch);
            }
            answer[i] = sb.toString();
    }

        return answer;
    }
}