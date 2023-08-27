class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] str = my_string.split("");
        for (String s : str) {
            if (s.equals(alp)) {
                answer += s.toUpperCase();
            } else {
                answer += s;
            }
        }
        return answer;
    }
}