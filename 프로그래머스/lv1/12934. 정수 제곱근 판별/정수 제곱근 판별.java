class Solution {
    public long solution(long n) {
        long answer = 0;
        double result =  Math.sqrt(n);
        if (result%1 == 0) {
            answer = (long) Math.pow(result + 1, 2);
            return answer;
        } else {
            answer = -1;
            return answer;
        }
    }
}
