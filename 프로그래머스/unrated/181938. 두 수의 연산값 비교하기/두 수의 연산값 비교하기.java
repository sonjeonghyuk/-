class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num1 = 0;
        int num2 = 2 * a * b;
        String str = "";
        str = Integer.toString(a) + Integer.toString(b);
        num1 = Integer.parseInt(str);

        answer = (num1 > num2) ? num1 : num2;
        return answer;
    }
}