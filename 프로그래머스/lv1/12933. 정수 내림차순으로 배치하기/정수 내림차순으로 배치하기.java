import java.util.*;
class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] s = str.toCharArray();
        Arrays.sort(s);
        String sb = new StringBuilder(new String(s)).reverse().toString();
        
        return(Long.parseLong(sb));
    }
}