class Solution {
    public int solution(int n) {
        int count = 0;
        int answer = 0;

        for (int j = n; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                answer++;
            }
            count = 0;
        }
        return answer;
    }
}