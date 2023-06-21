class Solution {
    public long solution(long num) {
        long answer = 0;
        long count = 0;
        while (true){
            if (num == 1){
                break;
            }
            if(num%2 == 0){
                count++;
                num = num/2;
            } else {
                count++;
                num = num*3 +1;
            }
            if(count == 500) {
                count = -1;
                break;
            }

        }
        return count;
        
    }
}