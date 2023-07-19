import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            String op = str[1];

            if(Objects.equals(op, "+")){
                answer[i] = Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4]) ? "O" : "X";
            } else if (Objects.equals(op, "-")) {
                answer[i] = Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4]) ? "O" : "X";
            }

        }
        return answer;
    }
}