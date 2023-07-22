import java.util.Objects;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        StringBuffer sb = new StringBuffer();

        for (String strr : str){
            if (Objects.equals(strr, strr.toLowerCase())){
                sb.append(strr.toUpperCase());
            } else if (Objects.equals(strr, strr.toUpperCase())){
                sb.append(strr.toLowerCase());
            }
        }

        System.out.println("sb = " + sb);
        answer = String.valueOf(sb);
        return answer;
    }
}