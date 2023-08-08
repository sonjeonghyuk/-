class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(control);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'w'){
                n += 1;
            } else if (sb.charAt(i) == 's') {
                n -= 1;
            } else if (sb.charAt(i) == 'd') {
                n += 10;
            } else if (sb.charAt(i) == 'a') {
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}