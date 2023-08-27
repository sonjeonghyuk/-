class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] str1 = my_string.split("");
        String[] str2 = is_prefix.split("");

        for (int i = 0; i < str2.length; i++) {
            if (str1.length < str2.length) {
                answer = 0;
                break;
            }
            
            if (str1[i].equals(str2[i])) {
                answer = 1;
            } else {
                answer = 0;
                break;

            }
        }
        return answer;
    }
}