class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                sb1.append(num_list[i]);
            } else {
                sb.append(num_list[i]);
            }
            System.out.println("sb = " + sb);
            System.out.println("sb1 = " + sb1);
        }
        int answer = Integer.parseInt(sb.toString()) + Integer.parseInt(sb1.toString());
        
        return answer;
    }
}