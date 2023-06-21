class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        
        while (n>0){
            str = (n%3) + str;
            n /= 3;
        }
        
        String sb = new StringBuilder(new String(str)).reverse().toString();
        answer = Integer.parseInt(sb,3);
        
        return answer;
    }
}