import java.util.ArrayList;

class Solution {
    public String solution(String n_str) {
        ArrayList<String> list = new ArrayList<>();
        String[] str = n_str.split("");

        for (String item : str) {
            list.add(item);
        }

        while (list.get(0).equals("0")) {
            list.remove(0);
        }

        String answer = "";
        for (String item : list) {
            answer += item;
        }
        return answer;
    }
}