class Solution {
    public int solution(int n) {
        int sum = 1;
        int count = 1;
        int answer = 0;
        while (true) {
            for (int j = count; j >= 1; j--) {
                sum *= j;
            }
            System.out.println("answer = " + sum);

            if (sum > n) {
                answer = count - 1;
                System.out.println("answer = " + answer);
                break;
            } else if (sum == n) {
                answer = count;
                System.out.println("answer = " + answer);
                break;
            } else {
                count++;
                sum = 1;
            }

        }
        return answer;
    }
}