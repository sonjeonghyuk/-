class Solution {
    public String solution(String rsp) {
        String[] str = rsp.split("");
        String answer = "";

        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("2")){
                answer += "0";
            } else if (str[i].contains("0")) {
                answer += "5";
            } else if (str[i].contains("5")){
                answer += "2";
            }
        }
        return answer;
    }
}