class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int count_cano = 0;
        int count_latte = 0;
        

        for (int i = 0; i < order.length ; i++) {
            if (order[i].contains("americano") || order[i].contains("anything")) {
                count_cano++;
            } else if (order[i].contains("latte")){
                count_latte++;
            }
        }

        answer = count_latte * 5000 + count_cano * 4500;
        return answer;
    }
}