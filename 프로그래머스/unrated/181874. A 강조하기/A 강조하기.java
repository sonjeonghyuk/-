class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] str = myString.split("");

        for (int i = 0; i < myString.length(); i++) {
            if (str[i].equals("a")) {
                answer += "A";
            } else if (str[i].equals("A")){
                answer += "A";
            } else {
                answer += str[i].toLowerCase();
            }
        }
        return answer;
    }
}