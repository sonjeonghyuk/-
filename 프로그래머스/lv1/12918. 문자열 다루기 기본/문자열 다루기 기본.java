class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(!(s.length()==4 || s.length()==6)) return false;
        try {
            int isNum = Integer.valueOf(s);
        } catch (Exception e){
            return false;
        }
        return answer;
    }
}