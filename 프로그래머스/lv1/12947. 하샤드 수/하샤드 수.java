class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int y = 0;
        String str = Integer.toString(x);

        for (int i=0; i<str.length(); i++){
            y += Integer.parseInt(str.substring(i,i+1));
        }
        if (x%y == 0){
            return answer;
        } else {
            return !answer;
        }

    }
}