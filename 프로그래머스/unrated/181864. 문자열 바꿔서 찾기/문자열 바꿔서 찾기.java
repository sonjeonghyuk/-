class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String s1 = "";
        String[] str = myString.split("");
        String[] str1 = new String[myString.length()];

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("A")) {
                str1[i] = "B";
            } else {
                str1[i] = "A";
            }
        }
        
        for (int i = 0; i < str1.length; i++) {
            s1 += str1[i];
        }
        
        if (s1.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}