class Solution {
    public int solution(int price) {
        int answer = 0;
        double answer1 = 0;
        if (price >= 500000) {
            answer1 = price * 0.8;
        } else if (price >= 300000) {
            answer1 = price * 0.9;
        } else if (price >= 100000) {
            answer1 = price * 0.95;
        } else answer1 = price;
        answer = (int)answer1;
        return answer;
    }
}