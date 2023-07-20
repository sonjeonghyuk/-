class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String str = "";
        StringBuffer sb = new StringBuffer();

        String[] strArray = my_string.split("");
        str = strArray[num1];
        strArray[num1] = strArray[num2];
        strArray[num2] = str;

        for (int i = 0; i < my_string.length(); i++) {
            sb.append(strArray[i]);
        }

        answer = sb.toString();
        return answer;
    }
}