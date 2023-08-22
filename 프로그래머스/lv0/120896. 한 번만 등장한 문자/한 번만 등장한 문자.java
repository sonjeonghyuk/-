class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
                "v","w","x","y","z"};
        int[] arr = new int[str.length];

        String[] str1 = s.split("");


        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str1[i].equals(str[j])) {
                    arr[j] += 1;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer += str[i];
            }
        }
        return answer;
    }
}