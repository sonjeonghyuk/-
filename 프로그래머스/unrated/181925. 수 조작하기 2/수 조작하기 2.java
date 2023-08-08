class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 0; i < numLog.length - 1; i++) {
            answer += numLog[i+1] - numLog[i] == 1 ? "w" : numLog[i+1] - numLog[i] == -1 ? "s" :
                    numLog[i+1] - numLog[i] == 10 ? "d" : "a";
        }
        return answer;
    }
}